package com.example.shipping.controller;

import com.example.shipping.model.request.CreatePacketRequest;
import com.example.shipping.model.response.CreatePacketResponse;
import com.example.shipping.service.PacketService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("packet")
public class PacketController {

    public final PacketService packetService;

    public PacketController(PacketService packetService) {
        this.packetService = packetService;
    }

    @RequestMapping("/createPacket")
    public CreatePacketResponse createPacket(@RequestBody CreatePacketRequest createPacketRequest){
        return packetService.createPackage(createPacketRequest);
    }
}
