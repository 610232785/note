package com.gupao.designpattern.factorypattern01.simplefactory01;

/**
 * describe:简单工厂模式
 *
 *
 * @author rainly
 * @date 2020/4/5
 * @time 4:10 下午
 */
public class Test {
    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        //通过工厂来创建产品，而不是由客户端进行创建
        Product product = simpleFactory.create(ProductA.class);
        product.work();
    }
}
