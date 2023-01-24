package com.example.shipping.service;

import com.example.shipping.entity.Packet;
import com.example.shipping.model.request.CreatePacketRequest;
import com.example.shipping.model.request.UpdatePacketRequest;
import com.example.shipping.model.response.CreatePacketResponse;

import java.util.List;

public interface PacketService {
    CreatePacketResponse createPackage(CreatePacketRequest createPacketRequest);

    CreatePacketResponse updatePacket(UpdatePacketRequest updatePacketRequest);
    List<CreatePacketResponse> getPacket();

    Packet getPacket(String Barcode);
    void updateStatus(Packet packet);

    void deletePacket(String barcode);
}
