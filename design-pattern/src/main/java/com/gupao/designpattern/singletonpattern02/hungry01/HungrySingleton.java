package com.gupao.designpattern.singletonpattern02.hungry01;

/**
 * describe:饿汉式单例
 *
 * @author rainly
 * @date 2020/4/5
 * @time 7:48 下午
 */
public class HungrySingleton {

    private HungrySingleton(){

    }
    //一般写法
    private final static HungrySingleton hungrySingleton = new HungrySingleton();

    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }
}
