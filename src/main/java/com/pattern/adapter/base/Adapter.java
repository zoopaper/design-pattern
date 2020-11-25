package com.pattern.adapter.base;

/**
 * Adapter为定义好的一个适配器，该适配器是为了满足一方提供的功能，无法适配另一个对象功能的实现，在这样的实现中，
 * 为了满足当前目标类(Target)可以适配另一个业务对象功能的实现，由此产生了中间适配层，也就是是Adapter适配器，
 * 同样也要根据实际业务场景定义适合业务命名的适配器
 * 适配器要实现原理：
 * 1. 实现目标接口
 * 2. 注入适配者
 * <p>
 * 注入适配者的方式
 * 1. 通过构造函数注入
 * 2. 通过set函数注入
 *
 * @author krisjin
 * @date 2020/11/25
 */
public class Adapter extends Adaptee implements Target {
    private Adaptee adaptee;

    /**
     * 使用构造函数传入适配者
     *
     * @param adaptee
     */
    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void pull() {
        System.out.println("Adaptee适配者执行...");
    }
}
