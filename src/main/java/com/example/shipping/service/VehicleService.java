package com.example.shipping.service;

import com.example.shipping.model.request.CreateVehicleRequest;
import com.example.shipping.model.response.CreateVehicleResponse;

public interface VehicleService {

    CreateVehicleResponse createVehicle(CreateVehicleRequest createVehicleRequest);
}
