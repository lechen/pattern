package com.le.demo.pattern.factory.v0;

import com.le.demo.pattern.factory.EnumPizzType;

/**
 * Created by LE on 2017/3/31.
 */
public class MainTest {
    public static void main(String[] args) {
        PizzStory story = new PizzStory();
        story.orderPizz(EnumPizzType.A);
    }
}
