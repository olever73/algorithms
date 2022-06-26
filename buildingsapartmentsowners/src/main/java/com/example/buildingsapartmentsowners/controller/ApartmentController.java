package com.example.buildingsapartmentsowners.controller;


import com.example.buildingsapartmentsowners.dto.ApartmentResponseDTO;
import com.example.buildingsapartmentsowners.service.ApartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api")
public class ApartmentController {


    @Autowired
    private ApartmentService apartmentService;




    @GetMapping("/apartments")
    public List<ApartmentResponseDTO>getAll(){
        return apartmentService.getAllApartments();
    }


}
