package com.le.demo.pattern.decorator.v2;

/**
 * Created by LE on 2017/3/28.
 */
public class BaseCafe1 implements Beverage {

    @Override
    public float cost() {
        return 10;
    }

    @Override
    public String getDiscription() {
        return "BaseCafe1";
    }

}
