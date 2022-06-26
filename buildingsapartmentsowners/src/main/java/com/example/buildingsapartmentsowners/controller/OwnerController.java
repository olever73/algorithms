package com.example.buildingsapartmentsowners.controller;

import com.example.buildingsapartmentsowners.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class OwnerController {

    @Autowired
    private OwnerService ownerService;



}

