package com.pattern.adapter.base;

/**
 * 适配者在业务中提供了一个push的功能，但是Target目前业务接口定义中只有pull功能，
 * 在需求实现中又要统一从target提供的pull中使用，要装载适配的类为当前业务类，
 * 比如我们定义的Adaptee适配者，在实际应用中，就是业务系统中某一个类。
 * <p>
 * 当然适配者可以是一个业务类，适配者也可以是接口编程
 *
 * @author krisjin
 * @date 2020/11/25
 */
public class Adaptee {

    public void push() {
        System.err.println(111);
    }

}
