package com.gupao.designpattern.factorypattern01.abstractfactory03;

/**
 * describe:
 *
 * @author rainly
 * @date 2020/4/5
 * @time 5:57 下午
 */
public class MeiDiAirCondition implements AirCondition {
    @Override
    public void work() {
        System.out.println("美的空调在工作");
    }
}
