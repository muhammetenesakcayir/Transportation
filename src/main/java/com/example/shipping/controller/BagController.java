package com.example.shipping.controller;

import com.example.shipping.model.request.CreateBagRequest;
import com.example.shipping.model.request.UpdateBagRequest;
import com.example.shipping.model.response.CreateBagResponse;
import com.example.shipping.service.BagService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("bag")
public class BagController {

    private final BagService bagService;

    public BagController(BagService bagService) {
        this.bagService = bagService;
    }

    @PostMapping("/createBag")
    public CreateBagResponse createBag(@RequestBody CreateBagRequest createBagRequest){
        return bagService.createBag(createBagRequest);
    }

    @PutMapping("/updateBag")
    public CreateBagResponse updateBag(@RequestBody UpdateBagRequest updateBagRequest){
        return bagService.updateBag(updateBagRequest);
    }

    @GetMapping("/getBag")
    public List<CreateBagResponse> getBag(){
        return bagService.getBag();
    }

    @DeleteMapping("/deleteBag")
    public void deleteBag(@RequestParam String barcode){
        bagService.deleteBag(barcode);
    }

}
