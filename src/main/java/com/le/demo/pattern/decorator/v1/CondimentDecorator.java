package com.le.demo.pattern.decorator.v1;

/**
 * Created by LE on 2017/3/28.
 */
public abstract class CondimentDecorator extends Beverage {

    public Beverage beverage;

    public CondimentDecorator(Beverage beverage){
        this.beverage = beverage;
    }

    public String getDiscription() {
        return this.getClass().getSimpleName()
                + " + " + this.beverage.getDiscription();
    }
}
