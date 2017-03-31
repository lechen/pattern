package com.le.demo.pattern.factory.v1;

import com.le.demo.pattern.factory.EnumPizzType;
import com.le.demo.pattern.factory.v0.Pizz;

/**
 * Created by LE on 2017/3/31.
 */
public abstract class PizzStory {
    Pizz pizz;

    public Pizz orderPizz(EnumPizzType type){
        pizz = createPizz(type);
        this.prepare();
        this.bake();
        System.out.println("pizz is " + pizz.getName());
        return pizz;
    }

    public abstract Pizz createPizz(EnumPizzType type);

    public void prepare(){
        System.out.println("prepare ...");
    }

    public void bake(){
        System.out.println("bake ...");
    }
}
