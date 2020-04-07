package com.gupao.designpattern.singletonpattern02;

/**
 * describe:
 *
 * @author rainly
 * @date 2020/4/5
 * @time 8:00 下午
 */
public class Test {

    public static void main(String[] args) {
        //测试验证多线程下单例是否线程安全
        Thread thread1 = new Thread(new ExectorThread());
        Thread thread2 = new Thread(new ExectorThread());

        thread1.start();
        thread2.start();
        System.out.println("end");

    }

}
