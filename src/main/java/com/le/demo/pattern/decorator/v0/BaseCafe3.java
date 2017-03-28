package com.le.demo.pattern.decorator.v0;

/**
 * Created by LE on 2017/3/28.
 */
public class BaseCafe3 extends Beverage {

    public BaseCafe3(){
        this.discription = "BaseCafe3";
    }

    @Override
    public float cost() {
        return 30;
    }

}
