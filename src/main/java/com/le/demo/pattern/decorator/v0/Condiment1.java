package com.le.demo.pattern.decorator.v0;

/**
 * Created by LE on 2017/3/28.
 */
public class Condiment1 extends CondimentDecorator {
    public Beverage beverage;

    public Condiment1(Beverage beverage){
        this.beverage = beverage;
    }
    @Override
    public float cost() {
        return 1f + beverage.cost();
    }

    @Override
    public String getDiscription() {
        return this.getClass().getSimpleName();
    }
}
