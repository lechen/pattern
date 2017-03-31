package com.le.demo.pattern.factory.v0;

import com.le.demo.pattern.factory.EnumPizzType;

/**
 * Created by LE on 2017/3/30.
 */
public class PizzStory {

    private SimpleFactory factory;

    public PizzStory (){
        factory = new SimpleFactory();
    }

    public Pizz orderPizz(EnumPizzType type){
        return factory.createPizz(type);
    }

}
