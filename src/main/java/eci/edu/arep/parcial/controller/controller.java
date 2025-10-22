package eci.edu.arep.parcial.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import eci.edu.arep.parcial.services.Services;

@RestController
@RequestMapping("/math")
public class Controller {

    @Autowired
    Services services;

    @PostMapping("/plus")
    public Float plus(Float a, Float b ){
        return services.plus(a, b);
    }

    @PostMapping("/minus")
    public Float minus(Float a, Float b ){
        return services.minus(a, b);
    }

    @PostMapping("/square")
    public Float square(Float a){
        return services.square(a);
    }
    

}
