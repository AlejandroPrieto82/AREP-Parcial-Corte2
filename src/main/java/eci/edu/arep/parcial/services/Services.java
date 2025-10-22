package eci.edu.arep.parcial.services;

import org.springframework.stereotype.Service;

@Service
public class Services implements ServicesInterface{

    @Override
    public Float minus(float a, float b) {
        return a - b;
    }

    @Override
    public Float plus(float a, float b) {
        return a + b;
    }

    @Override
    public Float square(float a) {
        float b = a*a;
        return b;
    }    
}
