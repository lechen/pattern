package com.le.demo.pattern.decorator.v2;

/**
 * Created by LE on 2017/3/28.
 * 装饰
 */
public class MainTest {
    public static void main(String[] args) {
        // cafe2 + c1
        BaseCafe1 cafe1 = new BaseCafe1();
        Condiment1 c1 = new Condiment1(cafe1);
        System.out.println(c1.getDiscription() + " : " + c1.cost());

        // cafe2 + c1 + 2 * c2
        BaseCafe2 cafe2 = new BaseCafe2();
        Condiment1 c21 = new Condiment1(cafe2);
        Condiment2 c22 = new Condiment2(c21);
        Condiment2 c222 = new Condiment2(c22);
        System.out.println(c222.getDiscription() + " : " + c222.cost());

    }
}
