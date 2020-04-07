package com.gupao.designpattern.singletonpattern02.lazy02;

/**
 * describe:
 *
 * @author rainly
 * @date 2020/4/5
 * @time 7:57 下午
 */
public class LazyDoubleSyncSingleton {
    private LazyDoubleSyncSingleton() {
    }

    //volatile保证了lazySingleton共享变量在多线程下的可见性 同时禁止指令重排序
    private volatile static LazyDoubleSyncSingleton lazySingleton = null;

    //双重检查锁
    public static LazyDoubleSyncSingleton getInstance() {
        //第一次检查是否要阻塞
        if (null == lazySingleton){
            synchronized (LazyDoubleSyncSingleton.class){
                //第二次检查是否要创建实例
                if (null == lazySingleton){
                    lazySingleton = new LazyDoubleSyncSingleton();
                }
            }
        }
        return lazySingleton;
    }

    /**
     * 防止通过序列号和反序列化破坏单例
     * readResolve ObjectStreamClass.java invokeReadResolve方法
     * @return
     */
    private Object readResolve(){
        return lazySingleton;
    }
}
