package com.gupao.designpattern.factorypattern01.abstractfactory03;

/**
 * describe:
 *
 * @author rainly
 * @date 2020/4/5
 * @time 6:08 下午
 */
public class Test {
    public static void main(String[] args) {
        BrandFactory meiDi = new MeiDiBrandFactory();
        meiDi.createAirCondition().work();
        meiDi.createGeyser().work();
        meiDi.createMicrowaveOven().work();

        BrandFactory gree = new GreeBrandFactory();
        gree.createAirCondition().work();
        gree.createGeyser().work();
        gree.createMicrowaveOven().work();
    }
}
