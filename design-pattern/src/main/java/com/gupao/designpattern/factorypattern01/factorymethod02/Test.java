package com.gupao.designpattern.factorypattern01.factorymethod02;

/**
 * describe:工厂方法模式
 *
 * @author rainly
 * @date 2020/4/5
 * @time 4:25 下午
 */
public class Test {
    public static void main(String[] args) {
        //客户端通过指定的工厂创建对应的产品，一个产品对应一个工厂
        FactoryMethodPatternFactory productAFactory = new ProductAFactory();
        Product productA = productAFactory.create();
        productA.work();
        FactoryMethodPatternFactory productBFactory = new ProductBFactory();
        Product productB = productBFactory.create();
        productB.work();
    }

}
