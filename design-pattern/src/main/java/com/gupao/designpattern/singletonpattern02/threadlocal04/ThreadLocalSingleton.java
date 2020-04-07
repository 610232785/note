package com.gupao.designpattern.singletonpattern02.threadlocal04;

/**
 * describe:
 *
 * @author rainly
 * @date 2020/4/6
 * @time 5:31 下午
 */
public class ThreadLocalSingleton {

    private ThreadLocalSingleton() {
    }

    private static final ThreadLocal<ThreadLocalSingleton> threadLocalSingleton = new ThreadLocal<ThreadLocalSingleton>(){
        @Override
        protected ThreadLocalSingleton initialValue() {
            return new ThreadLocalSingleton();
        }
    };

    public static ThreadLocalSingleton getInstance(){
        return threadLocalSingleton.get();
    }

}
