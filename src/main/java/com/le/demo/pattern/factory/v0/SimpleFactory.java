package com.le.demo.pattern.factory.v0;

import com.le.demo.pattern.factory.EnumPizzType;

/**
 * Created by LE on 2017/3/30.
 * 简单工厂
 */
public class SimpleFactory {

    public Pizz createPizz(EnumPizzType type){
        Pizz pizz = null;
        if (type == EnumPizzType.A){
            pizz = new PizzA();
        } else if (type == EnumPizzType.B) {
            pizz = new PizzB();
        } else if (type == EnumPizzType.C) {
            pizz = new PizzC();
        } else if (type == EnumPizzType.D) {
            pizz = new PizzD();
        }

        System.out.println("pizz name is " + pizz.getName());
        return pizz;
    }
}
