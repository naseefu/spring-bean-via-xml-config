package com.constructor.injection;

public class Car {

    private Specification specification;

    public Car(Specification specification){
        this.specification = specification;
    }

    public void displayDetailsOfCar(){
        System.out.println("CAR DETAILS : "+specification.toString());
    }

}
