package com.example.shipping.service.Impl;

import com.example.shipping.entity.Bag;
import com.example.shipping.model.request.CreateBagRequest;
import com.example.shipping.model.request.UpdateBagRequest;
import com.example.shipping.model.response.CreateBagResponse;
import com.example.shipping.repository.BagRepository;
import com.example.shipping.service.BagService;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class BagServiceImpl implements BagService {

    private final BagRepository bagRepository;

    public BagServiceImpl(BagRepository bagRepository) {
        this.bagRepository = bagRepository;
    }

    @Override
    public CreateBagResponse createBag(CreateBagRequest createBagRequest) {
        Bag bag = new Bag();
        bag.setBarcode(createBagRequest.getBarcode());
        Date date = new Date();
        String dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(date);
        bag.setCreateDate(dateFormat);
        bagRepository.save(bag);
        return new CreateBagResponse(bag.getId(),bag.getBarcode());
    }

    @Override
    public CreateBagResponse updateBag(UpdateBagRequest updateBagRequest){
        Bag bag = bagRepository.findById(updateBagRequest.getId()).orElseThrow(RuntimeException::new);
        bag.setBarcode(updateBagRequest.getBarcode());
        Date date = new Date();
        String dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(date);
        bag.setUpdateDate(dateFormat);
        bagRepository.save(bag);
        return new CreateBagResponse(bag.getId(), bag.getBarcode());
    }

    @Override
    public List<CreateBagResponse> getBag(){
        List<Bag> bagList = bagRepository.findAll();
        List<CreateBagResponse> createBagResponseList = new ArrayList<>();
        for (Bag bag : bagList ) {
            CreateBagResponse createBagResponse = new CreateBagResponse();
            createBagResponse.setId(bag.getId());
            createBagResponse.setBarcode(bag.getBarcode());
            createBagResponseList.add(createBagResponse);
        }
        return createBagResponseList;
    }

    @Override
    public void deleteBag(String barcode){
        Bag bag = bagRepository.findBagByBarcode(barcode);
        bagRepository.delete(bag);
    }

}
