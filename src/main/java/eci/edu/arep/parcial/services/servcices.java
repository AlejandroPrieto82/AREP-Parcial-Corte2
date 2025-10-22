package eci.edu.arep.parcial.services;

import org.springframework.stereotype.Service;

@Service
public class servcices implements servicesInterface{

    @Override
    public Float minus(float a, float b) {
        return a - b;
    }

    @Override
    public Float plus(float a, float b) {
        return a + b;
    }

    @Override
    public Float square(int a) {
        float b = a*a;
        return b;
    }    
}
