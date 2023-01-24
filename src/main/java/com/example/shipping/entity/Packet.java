package com.example.shipping.entity;

import com.example.shipping.enums.DeliveryPointStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
public class Packet {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private Long id;

    @Column(nullable = false)
    private String barcode;

    @Column
    private Integer volumetricWeight;

    @Column
    private String deliveryPoint;

    @Column
    private String status;

    @Column
    private Date createDate;

    @Column
    private Date updateDate;

}
