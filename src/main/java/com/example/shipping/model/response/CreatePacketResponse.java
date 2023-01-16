package com.example.shipping.model.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreatePacketResponse {

    private Long id;
    private String barcode;
    private Integer volumetricWeight;

    public CreatePacketResponse(Long id, String barcode, Integer volumetricWeight) {
        this.id = id;
        this.barcode = barcode;
        this.volumetricWeight = volumetricWeight;
    }
}
