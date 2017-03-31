package com.le.demo.pattern.factory.v1;

import com.le.demo.pattern.factory.EnumPizzType;
import com.le.demo.pattern.factory.v0.Pizz;

/**
 * Created by LE on 2017/3/31.
 */
public class ChPizzStory extends PizzStory {
    @Override
    public Pizz createPizz(EnumPizzType type) {
        if (EnumPizzType.A == type) {
            pizz = new ChPizzA();
        } else if (EnumPizzType.B == type) {
            pizz = new ChPizzB();
        }

        return pizz;
    }
}
