package com.example.shipping.model.response;

import com.example.shipping.model.ShippingModel;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ShippingModelResponse {

    private List<String> plateNumber;
    private List<ShippingModel> shippingModelList;
}
