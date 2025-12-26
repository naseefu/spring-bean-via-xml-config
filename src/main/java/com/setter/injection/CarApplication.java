package com.setter.injection;

import com.setter.injection.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarApplication {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationSetterInjection.xml");
        Car car = context.getBean("myCar", Car.class);
        car.displayDetailsOfCar();
    }

}
