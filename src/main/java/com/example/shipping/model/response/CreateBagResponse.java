package com.example.shipping.model.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateBagResponse {

    private Long id;
    private String barcode;

    public CreateBagResponse(Long id, String barcode) {
        this.id = id;
        this.barcode = barcode;
    }

    public CreateBagResponse() {

    }
}
