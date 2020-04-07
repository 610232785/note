package com.gupao.designpattern.singletonpattern02.lazy02;

/**
 * describe:
 *
 * @author rainly
 * @date 2020/4/5
 * @time 7:57 下午
 */
public class LazyInnerClassSingleton {
    private LazyInnerClassSingleton() {
        //避免通过反射破坏单例
        if (inner.lazySingleton != null){
            throw new RuntimeException("不允许非法访问");
        }
    }

    //线程不安全
    public static LazyInnerClassSingleton getInstance() {
        return inner.lazySingleton;
    }

    /**
     * 通过内部类的方式创建，利用java本身的语法，静态内部类是被调用时才创建
     */
    private static class inner{
        private static final LazyInnerClassSingleton lazySingleton = new LazyInnerClassSingleton();
    }
}
