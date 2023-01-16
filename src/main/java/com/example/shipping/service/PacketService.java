package com.example.shipping.service;

import com.example.shipping.model.request.CreatePacketRequest;
import com.example.shipping.model.response.CreatePacketResponse;

public interface PacketService {
    CreatePacketResponse createPackage(CreatePacketRequest createPacketRequest);
}
