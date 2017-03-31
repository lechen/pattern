package com.le.demo.pattern.factory.v1;

import com.le.demo.pattern.factory.EnumPizzType;

/**
 * Created by LE on 2017/3/31.
 */
public class MainTest {

    public static void main(String[] args) {
        PizzStory story = new NYPizzStory();
        story.orderPizz(EnumPizzType.A);

        PizzStory story2 = new ChPizzStory();
        story2.orderPizz(EnumPizzType.B);
    }
}
