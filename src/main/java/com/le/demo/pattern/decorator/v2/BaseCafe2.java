package com.le.demo.pattern.decorator.v2;

/**
 * Created by LE on 2017/3/28.
 */
public class BaseCafe2 implements Beverage {

    @Override
    public float cost() {
        return 20;
    }

    @Override
    public String getDiscription() {
        return "BaseCafe2";
    }

}
