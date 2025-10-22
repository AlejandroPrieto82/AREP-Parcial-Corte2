package eci.edu.arep.parcial.controller;

import org.apache.tomcat.util.json.JSONParser;
import org.apache.tomcat.util.json.JSONParserConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.util.JSONPObject;

import eci.edu.arep.parcial.services.Services;

@RestController
@RequestMapping("/mathServices")
public class Controller {

    @Autowired
    Services services;

    @GetMapping("/fibwin")
    public ResponseEntity<String> fibwin(@RequestParam int value){
        try {
            return ResponseEntity.ok("operation: Fibonacci con ventana K=3,\ninput: "+value+",\noutput: "+services.fibwin(value));

        } catch (Exception e) {
            return ResponseEntity.badRequest().body("Numero menor a 2");
        }
    }
}
