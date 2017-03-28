package com.le.demo.pattern.decorator.v2;

/**
 * Created by LE on 2017/3/28.
 */
public class Condiment1 extends CondimentDecorator {

    public Condiment1(Beverage beverage) {
        super(beverage);
    }

    @Override
    public float cost() {
        return 1f + beverage.cost();
    }

}
