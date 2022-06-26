package com.example.buildingsapartmentsowners.controller;


import com.example.buildingsapartmentsowners.dto.BuildingRequestDTO;

import com.example.buildingsapartmentsowners.service.BuildingService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BuildingController {


    @Autowired
    private BuildingService buildingService;




}
