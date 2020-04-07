package com.gupao.designpattern.factorypattern01.simplefactory01;

/**
 * describe:
 *
 * @author rainly
 * @date 2020/4/5
 * @time 4:06 下午
 */
public class ProductA implements Product {
    @Override
    public void work() {
        System.out.println("ProductA");
    }
}
