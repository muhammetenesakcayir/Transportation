package com.example.shipping.model.request;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UpdateBagRequest {

    private Long id;

    private String barcode;
}
