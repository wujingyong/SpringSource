package com.wjy.section5;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author young
 */
@Data
@Accessors(chain = true)
public class Car {
    private String brand;
    private int maxSpeed;
    private double price;
}
