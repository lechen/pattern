package com.le.demo.pattern.decorator.v0;

/**
 * Created by LE on 2017/3/28.
 *
 */
public class BaseCafe2 extends Beverage {

    public BaseCafe2(){
        this.discription = "BaseCafe2";
    }

    @Override
    public float cost() {
        return 20;
    }

}
