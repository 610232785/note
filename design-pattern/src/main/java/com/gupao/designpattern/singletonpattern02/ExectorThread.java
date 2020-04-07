package com.gupao.designpattern.singletonpattern02;

import com.gupao.designpattern.singletonpattern02.lazy02.LazySingleton;

/**
 * describe:
 *
 * @author rainly
 * @date 2020/4/5
 * @time 8:02 下午
 */
public class ExectorThread implements Runnable {
    @Override
    public void run() {
        LazySingleton lazySingleton = LazySingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + ":" + lazySingleton);
    }
}
