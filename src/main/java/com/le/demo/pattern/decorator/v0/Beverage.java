package com.le.demo.pattern.decorator.v0;

/**
 * Created by LE on 2017/3/28.
 * Beverage 可以是抽象类,也可是interface
 */
public abstract class Beverage {
    public String discription = "unKnow !";

    public abstract float cost ();

    public String getDiscription(){
        return this.discription;
    };

}
