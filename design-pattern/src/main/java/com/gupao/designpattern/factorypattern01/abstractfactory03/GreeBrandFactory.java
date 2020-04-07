package com.gupao.designpattern.factorypattern01.abstractfactory03;

/**
 * describe:
 *
 * @author rainly
 * @date 2020/4/5
 * @time 6:05 下午
 */
public class GreeBrandFactory extends BrandFactory {
    /**
     * 生产格力的空调
     * @return
     */
    @Override
    AirCondition createAirCondition() {
        return new GreeAirCondition();
    }

    /**
     * 生产格力的热水器
     * @return
     */
    @Override
    Geyser createGeyser() {
        return new GreeGeyser();
    }

    /**
     * 生产格力的微波炉
     * @return
     */
    @Override
    MicrowaveOven createMicrowaveOven() {
        return new GreeMicrowaveOven();
    }
}
