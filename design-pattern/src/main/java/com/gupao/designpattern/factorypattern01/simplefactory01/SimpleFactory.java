package com.gupao.designpattern.factorypattern01.simplefactory01;

/**
 * describe:
 *
 * @author rainly
 * @date 2020/4/5
 * @time 12:48 下午
 */
public class SimpleFactory {

    /**
     * 通过工厂来创建产品，而不是由客户端进行创建
     * @param clazz
     * @return
     */
    public Product create(Class<? extends Product> clazz){
        try {
            return clazz.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

}
