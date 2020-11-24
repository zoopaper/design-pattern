package com.pattern.command;

/**
 * 客户端角色
 * 创建一个具体命令对象并确定其接收者
 * User: krisjin
 * Date: 2016/8/2
 */
public class Client {

    public static void main(String[] args) {
        //创建真正执行的操作的对象
        Receiver receiver = new Receiver();
        //创建具体的命令对象
        Command command = new ConcreteCommand(receiver);
        //创建负责命令调用的对象
        Invoker invoker = new Invoker(command);
        //命令调用者执行命令
        invoker.action();
    }
}
