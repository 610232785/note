package com.gupao.designpattern.singletonpattern02.lazy02;

/**
 * describe:
 *
 * @author rainly
 * @date 2020/4/5
 * @time 7:57 下午
 */
public class LazySingleton {
    private LazySingleton() {
    }

    private static LazySingleton lazySingleton = null;

    //线程不安全
    public static LazySingleton getInstance() {
        if (null == lazySingleton){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

}
