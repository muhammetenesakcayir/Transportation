package com.example.shipping.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class Bag {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(unique = true, nullable = false)
    private String barcode;

    @Column
    private Integer deliveryPoint;

    @Column
    private Integer status;

    @Column
    private String createDate;

    @Column
    private String updateDate;

}
