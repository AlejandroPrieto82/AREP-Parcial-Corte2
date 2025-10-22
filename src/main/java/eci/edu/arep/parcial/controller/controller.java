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

    @PostMapping("/sum")
    public Float sum( ){
        return null;
    }

    @PostMapping("/minus")
    public Float minus( ){
        return null;
    }

    @PostMapping("/square")
    public Float square(){
        return null;
    }
    

}
