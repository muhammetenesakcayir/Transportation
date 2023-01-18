package com.example.shipping.service.Impl;

import com.example.shipping.entity.Packet;
import com.example.shipping.enums.DeliveryPointStatus;
import com.example.shipping.model.request.CreatePacketRequest;
import com.example.shipping.model.request.UpdatePacketRequest;
import com.example.shipping.model.response.CreatePacketResponse;
import com.example.shipping.repository.PacketRepository;
import com.example.shipping.service.PacketService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PacketServiceImpl implements PacketService {

    private final PacketRepository packetRepository;

    public PacketServiceImpl(PacketRepository packetRepository) {
        this.packetRepository = packetRepository;
    }

    @Override
    public CreatePacketResponse createPackage(CreatePacketRequest createPacketRequest) {
        Packet packet = new Packet();
        packet.setBarcode(createPacketRequest.getBarcode());
        packet.setVolumetricWeight(createPacketRequest.getVolumetricWeight());
        packet.setDelivery(String.valueOf(DeliveryPointStatus.convertValue(createPacketRequest.getDeliveryPoint())));
        packetRepository.save(packet);
        return new CreatePacketResponse(packet.getId(), packet.getBarcode(), packet.getVolumetricWeight());
    }

    @Override
    public CreatePacketResponse updatePacket(UpdatePacketRequest updatePacketRequest){
        Packet packet = packetRepository.findPacketByBarcode(updatePacketRequest.getBarcode());
        packet.setBarcode(updatePacketRequest.getUpdateBarcode());
        packetRepository.save(packet);
        return new CreatePacketResponse(packet.getId(),packet.getBarcode(),packet.getVolumetricWeight());
    }

    @Override
    public List<CreatePacketResponse> getPacket() {
        List<CreatePacketResponse> createPacketResponseList = new ArrayList<>();
        List<Packet> packetList = new ArrayList<>(packetRepository.findAll());
        for (Packet packet : packetList) {
            CreatePacketResponse createPacketResponse = new CreatePacketResponse(packet.getId(), packet.getBarcode(), packet.getVolumetricWeight());
            createPacketResponseList.add(createPacketResponse);
        }
        return createPacketResponseList;
    }

    @Override
    public void deletePacket(String barcode){
        packetRepository.delete(packetRepository.findPacketByBarcode(barcode));
    }
}
