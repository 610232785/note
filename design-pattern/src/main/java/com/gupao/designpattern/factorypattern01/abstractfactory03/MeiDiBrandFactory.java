package com.gupao.designpattern.factorypattern01.abstractfactory03;

/**
 * describe:
 *
 * @author rainly
 * @date 2020/4/5
 * @time 6:05 下午
 */
public class MeiDiBrandFactory extends BrandFactory {
    /**
     * 生产美的的空调
     * @return
     */
    @Override
    AirCondition createAirCondition() {
        return new MeiDiAirCondition();
    }

    /**
     * 生产美的的热水器
     * @return
     */
    @Override
    Geyser createGeyser() {
        return new MeiDiGeyser();
    }

    /**
     * 生产美的的微波炉
     * @return
     */
    @Override
    MicrowaveOven createMicrowaveOven() {
        return new MeiDiMicrowaveOven();
    }
}
