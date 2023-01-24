package com.example.shipping.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ShippingModel {

    private String plate;
    private List<RouteModel> route;
}
