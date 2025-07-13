package com.factory.cupcake_service.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cupcake")
public class CupcakeController {

    @GetMapping("/getAll")
    public List<String> getAll()
    {
       return List.of("Chocolate Cupcake", "Vanilla Cupcake", "Strawberry Cupcake");
    }
}
