package com.setter.injection;

import org.springframework.beans.factory.BeanRegistry;

public class Car {

    private Specification specification;

    public void setSpecification(Specification specification) {
        this.specification = specification;
    }

    public void displayDetailsOfCar(){
        System.out.println("CAR DETAILS : "+specification.toString());
    }
}
