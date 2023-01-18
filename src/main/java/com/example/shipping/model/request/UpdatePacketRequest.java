package com.example.shipping.model.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdatePacketRequest {

    private String barcode;

    private String updateBarcode;

}
