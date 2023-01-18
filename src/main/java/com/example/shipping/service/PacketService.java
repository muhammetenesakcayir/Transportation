package com.example.shipping.service;

import com.example.shipping.model.request.CreatePacketRequest;
import com.example.shipping.model.request.UpdatePacketRequest;
import com.example.shipping.model.response.CreatePacketResponse;

import java.util.List;

public interface PacketService {
    CreatePacketResponse createPackage(CreatePacketRequest createPacketRequest);

    CreatePacketResponse updatePacket(UpdatePacketRequest updatePacketRequest);
    List<CreatePacketResponse> getPacket();

    void deletePacket(String barcode);
}
