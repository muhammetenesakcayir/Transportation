package com.example.shipping.controller;

import com.example.shipping.model.request.CreatePacketRequest;
import com.example.shipping.model.request.UpdateBagRequest;
import com.example.shipping.model.request.UpdatePacketRequest;
import com.example.shipping.model.response.CreatePacketResponse;
import com.example.shipping.service.PacketService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("packet")
public class PacketController {

    public final PacketService packetService;

    public PacketController(PacketService packetService) {
        this.packetService = packetService;
    }

    @PostMapping("/createPacket")
    public CreatePacketResponse createPacket(@RequestBody CreatePacketRequest createPacketRequest){
        return packetService.createPackage(createPacketRequest);
    }

    @PutMapping("/updatePacket")
    public CreatePacketResponse updatePacket(@RequestBody UpdatePacketRequest updatePacketRequest){
        return packetService.updatePacket(updatePacketRequest);
    }

    @GetMapping("/getPacket")
    public List<CreatePacketResponse> getPacket(){
        return packetService.getPacket();
    }

    @DeleteMapping("/deletePacket")
    public void deletePacket(@RequestBody UpdatePacketRequest updatePacketRequest){
        packetService.deletePacket(updatePacketRequest.getBarcode());
    }
}
