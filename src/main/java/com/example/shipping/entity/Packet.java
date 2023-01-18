package com.example.shipping.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Packet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;

    @Column(nullable = false, unique = true)
    private String barcode;

    @Column
    private Integer volumetricWeight;

    private Integer DeliveryPoint;

    @Column
    private String Delivery;
}
