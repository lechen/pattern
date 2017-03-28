package com.le.demo.pattern.decorator.v1;

/**
 * Created by LE on 2017/3/28.
 */
public class Condiment2 extends CondimentDecorator {

    public Condiment2(Beverage beverage) {
        super(beverage);
    }

    @Override
    public float cost() {
        return 3f + this.beverage.cost();
    }
}
