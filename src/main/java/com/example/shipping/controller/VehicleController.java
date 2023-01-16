package com.example.shipping.controller;

import com.example.shipping.model.request.CreateVehicleRequest;
import com.example.shipping.model.response.CreateVehicleResponse;
import com.example.shipping.service.VehicleService;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("vehicle")
public class VehicleController {

    private final VehicleService vehicleService;

    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    @RequestMapping("/createVehicle")
    public CreateVehicleResponse createVehicle(@RequestBody CreateVehicleRequest createVehicleRequest){
        return vehicleService.createVehicle(createVehicleRequest);
    }

}
