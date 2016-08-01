package com.pattern.commond;

/**
 * 接收者角色
 * 扶着具体实施和执行一个请求，任何一个类都可以成为接收者，实施和执行的方法叫做行动方法。
 * User: shijingui
 * Date: 2016/8/2
 */
public class Receiver {
    public Receiver() {

    }

    public void action() {
        System.out.println("接收者在这里开始真正的执行工作了...");
    }
}
