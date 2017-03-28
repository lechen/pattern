package com.le.demo.pattern.decorator.v0;

/**
 * Created by LE on 2017/3/28.
 */
public class BaseCafe1 extends Beverage {

    public BaseCafe1(){
        this.discription = "BaseCafe1";
    }

    @Override
    public float cost() {
        return 10;
    }

}
