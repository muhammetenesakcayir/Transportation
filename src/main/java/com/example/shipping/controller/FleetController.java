package com.example.shipping.controller;

import com.example.shipping.model.ShippingModel;
import com.example.shipping.service.FleetService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("fleet")
public class FleetController {

    private final FleetService fleetService;

    public FleetController(FleetService fleetService) {
        this.fleetService = fleetService;
    }

    @PostMapping("/shipping")
    public void fleet(@RequestBody ShippingModel shippingModel){
        fleetService.shipping(shippingModel);
    }

    @PostMapping("/save")
    public void save(@RequestBody ShippingModel shippingModel){
        fleetService.save(shippingModel);
    }
}
