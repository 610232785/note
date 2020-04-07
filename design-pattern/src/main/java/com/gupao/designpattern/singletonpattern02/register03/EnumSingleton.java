package com.gupao.designpattern.singletonpattern02.register03;

/**
 * describe:枚举式单例
 *
 * @author rainly
 * @date 2020/4/6
 * @time 4:13 下午
 */
public enum EnumSingleton {

    INSTANCE;

    private Resource resource;

    EnumSingleton(){
        resource = new Resource();
    }

    public Resource getInstance() {
        return resource;
    }

    public class Resource {
    }

    public static void main(String[] args) {
        Resource resource = EnumSingleton.INSTANCE.getInstance();
    }
}
