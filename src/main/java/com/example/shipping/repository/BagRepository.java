package com.example.shipping.repository;

import com.example.shipping.entity.Bag;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BagRepository extends JpaRepository<Bag, Long> {
    Bag findBagByBarcode(String barcode);
}
