package com.le.demo.pattern.decorator.v1;

/**
 * Created by LE on 2017/3/28.
 */
public class Condiment3 extends CondimentDecorator {

    public Condiment3(Beverage beverage) {
        super(beverage);
    }

    @Override
    public float cost() {
        return 1f + this.cost();
    }
}
