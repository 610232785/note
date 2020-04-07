package com.gupao.designpattern.singletonpattern02.hungry01;

/**
 * describe:饿汉式单例
 *
 * @author rainly
 * @date 2020/4/5
 * @time 7:48 下午
 */
public class HungryStaticSingleton {

    private HungryStaticSingleton(){

    }
    //变种写法
    private final static HungryStaticSingleton hungrySingleton;
    static {
        hungrySingleton = new HungryStaticSingleton();
    }

    public static HungryStaticSingleton getInstance(){
        return hungrySingleton;
    }
}
