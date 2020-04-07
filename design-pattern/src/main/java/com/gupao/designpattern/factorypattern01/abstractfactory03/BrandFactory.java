package com.gupao.designpattern.factorypattern01.abstractfactory03;

/**
 * describe:品牌工厂
 *
 * @author rainly
 * @date 2020/4/5
 * @time 6:02 下午
 */
public abstract class BrandFactory {
    public void begin(){
        System.out.println("启动");
    }

    /**
     * 生产空调
     * @return
     */
    abstract AirCondition createAirCondition();

    /**
     * 生产热水器
     * @return
     */
    abstract Geyser createGeyser();

    /**
     * 生产微波炉
     * @return
     */
    abstract MicrowaveOven createMicrowaveOven();

}
