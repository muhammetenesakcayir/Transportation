package com.example.shipping.service.Impl;

import com.example.shipping.entity.Packet;
import com.example.shipping.model.request.CreatePacketRequest;
import com.example.shipping.model.response.CreatePacketResponse;
import com.example.shipping.repository.PacketRepository;
import com.example.shipping.service.PacketService;
import org.springframework.stereotype.Service;

@Service
public class PacketServiceImpl implements PacketService {

    private final PacketRepository packetRepository;

    public PacketServiceImpl(PacketRepository packetRepository) {
        this.packetRepository = packetRepository;
    }

    @Override
    public CreatePacketResponse createPackage(CreatePacketRequest createPacketRequest){
        Packet packet = new Packet();
        packet.setBarcode(createPacketRequest.getBarcode());
        packet.setVolumetricWeight(createPacketRequest.getVolumetricWeight());
        packetRepository.save(packet);
        return new CreatePacketResponse(packet.getId(),packet.getBarcode(),packet.getVolumetricWeight());
    }
}
