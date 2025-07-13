package com.factory.jam_service.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jam")
public class JamController {

    @GetMapping("/getAll")
    public List<String> getAll(){
       return List.of("Blueberry Jam","Linchee Jam");
    }
}
