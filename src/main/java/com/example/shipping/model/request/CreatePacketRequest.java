package com.example.shipping.model.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreatePacketRequest {

    private String barcode;
    private Integer volumetricWeight;
    private Integer deliveryPoint;
    private String status;

}
