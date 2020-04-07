package com.gupao.designpattern.factorypattern01.factorymethod02;

/**
 * describe:
 *
 * @author rainly
 * @date 2020/4/5
 * @time 4:23 下午
 */
public class ProductCFactory implements FactoryMethodPatternFactory {

    @Override
    public Product create() {
        return new ProductC();
    }
}
