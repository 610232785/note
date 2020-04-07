package com.gupao.designpattern.factorypattern01.abstractfactory03;

/**
 * describe:
 *
 * @author rainly
 * @date 2020/4/5
 * @time 5:57 下午
 */
public class MeiDiGeyser implements Geyser {
    @Override
    public void work() {
        System.out.println("美的热水器在工作");
    }
}
