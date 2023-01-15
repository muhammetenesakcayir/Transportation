package com.example.shipping.service;

import com.example.shipping.entity.Bag;
import com.example.shipping.model.request.CreateBagRequest;
import com.example.shipping.model.request.UpdateBagRequest;
import com.example.shipping.model.response.CreateBagResponse;

import java.util.List;

public interface BagService {
    CreateBagResponse createBag(CreateBagRequest createBagRequest);

    CreateBagResponse updateBag(UpdateBagRequest updateBagRequest);

    List<CreateBagResponse> getBag();

    void deleteBag(String barcode);
}
