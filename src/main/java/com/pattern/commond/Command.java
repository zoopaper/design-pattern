package com.pattern.commond;

/**
 * 命令角色
 * 声明了一个给所有具体命令类的抽象接口，这是一个抽象角色，通常由一个接口或者抽象类实现
 * User: shijingui
 * Date: 2016/8/2
 */
public interface Command {
    /**
     * 执行方法
     */
    public void execute();
}
