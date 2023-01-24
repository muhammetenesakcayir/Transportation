package com.example.shipping.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class RouteModel {

    private int deliveryPoint;
    private List<DeliveryModel> deliveries;
}
