package com.gupao.designpattern.singletonpattern02.lazy02;

/**
 * describe:
 *
 * @author rainly
 * @date 2020/4/5
 * @time 7:57 下午
 */
public class LazySyncSingleton {
    private LazySyncSingleton() {
    }

    private static LazySyncSingleton lazySingleton = null;

    //线程安全但有性能瓶颈
    public synchronized static LazySyncSingleton getInstance() {
        if (null == lazySingleton){
            lazySingleton = new LazySyncSingleton();
        }
        return lazySingleton;
    }
}
