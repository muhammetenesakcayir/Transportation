package com.example.shipping.service.Impl;

import com.example.shipping.entity.Vehicle;
import com.example.shipping.model.request.CreateVehicleRequest;
import com.example.shipping.model.response.CreateVehicleResponse;
import com.example.shipping.repository.VehicleRepository;
import com.example.shipping.service.VehicleService;
import org.springframework.stereotype.Service;

@Service
public class VehicleServiceImpl implements VehicleService {

    private final VehicleRepository vehicleRepository;

    public VehicleServiceImpl(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public CreateVehicleResponse createVehicle(CreateVehicleRequest createVehicleRequest) {
        Vehicle vehicle = new Vehicle();
        vehicle.setNumberPlate(createVehicleRequest.getNumberPlate());
        vehicleRepository.save(vehicle);
        CreateVehicleResponse createVehicleResponse = new CreateVehicleResponse();
        createVehicleResponse.setId(vehicle.getId());
        createVehicleResponse.setNumberPlate(vehicle.getNumberPlate());
        return createVehicleResponse;
    }
}
