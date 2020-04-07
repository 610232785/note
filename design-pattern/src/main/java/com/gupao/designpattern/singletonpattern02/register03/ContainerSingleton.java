package com.gupao.designpattern.singletonpattern02.register03;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * describe:容器式单例
 *
 * @author rainly
 * @date 2020/4/6
 * @time 4:51 下午
 */
public class ContainerSingleton {
    private ContainerSingleton() {
    }
    private static Map<String,Object> ioc = new ConcurrentHashMap<>();

    public static  Object getInstance(String className) throws Exception {
        Object instance = null;
        if (!ioc.containsKey(className)){
            instance = Class.forName(className).newInstance();
            ioc.put(className, instance);
            return instance;
        }else{
            return ioc.get(className);
        }
    }

}
