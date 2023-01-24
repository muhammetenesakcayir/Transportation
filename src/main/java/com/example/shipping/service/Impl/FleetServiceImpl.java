package com.example.shipping.service.Impl;

import com.example.shipping.entity.Packet;
import com.example.shipping.enums.LoadStatus;
import com.example.shipping.model.DeliveryModel;
import com.example.shipping.model.RouteModel;
import com.example.shipping.model.ShippingModel;
import com.example.shipping.model.request.CreatePacketRequest;
import com.example.shipping.service.BagService;
import com.example.shipping.service.FleetService;
import com.example.shipping.service.PacketService;
import org.springframework.stereotype.Service;

@Service
public class FleetServiceImpl implements FleetService {

    private final BagService bagService;
    private final PacketService packetService;

    public FleetServiceImpl(BagService bagService, PacketService packetService) {
        this.bagService = bagService;
        this.packetService = packetService;
    }

    @Override
    public void save(ShippingModel shippingModel) {
        for (RouteModel routeModel : shippingModel.getRoute()) {
            for(DeliveryModel deliveryModel: routeModel.getDeliveries()){
                CreatePacketRequest createPacketRequest = new CreatePacketRequest();
                createPacketRequest.setBarcode(deliveryModel.getBarcode());
                createPacketRequest.setVolumetricWeight(1);
                createPacketRequest.setDeliveryPoint(routeModel.getDeliveryPoint());
                createPacketRequest.setStatus(LoadStatus.convertValue(1));
                packetService.createPackage(createPacketRequest);
            }
        }
    }

    @Override
    public void shipping(ShippingModel shippingModel) {
        deliveryPointControl(shippingModel);
    }

    @Override
    public void deliveryPointControl(ShippingModel shippingModel) {
        for (RouteModel routeModel : shippingModel.getRoute()) {
            for (DeliveryModel delivery : routeModel.getDeliveries()) {
                    Packet packet = packetService.getPacket(delivery.getBarcode());
                    packet.setStatus(LoadStatus.convertValue(2));
                    packetService.updateStatus(packet);
            }
        }
    }
}
