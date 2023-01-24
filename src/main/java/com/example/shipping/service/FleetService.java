package com.example.shipping.service;

import com.example.shipping.model.ShippingModel;

public interface FleetService {

    void save(ShippingModel shippingModel);
    void shipping(ShippingModel shippingModel);

    void deliveryPointControl(ShippingModel shippingModel);
}
