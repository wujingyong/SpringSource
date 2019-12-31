package com.wjy.section5;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.FactoryBean;

public class CarFactoryBean implements FactoryBean<Car> {

    @Getter@Setter
    private String carInfo;
    @Override
    public Car getObject() throws Exception {
        Car car = new Car();
        String[] split = carInfo.split(",");
        return car
                .setBrand(split[0])
                .setMaxSpeed(Integer.valueOf(split[1]))
                .setPrice(Double.valueOf(split[2]));
    }

    @Override
    public Class<?> getObjectType() {
        return Car.class;
    }
}
