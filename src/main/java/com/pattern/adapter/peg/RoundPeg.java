package com.pattern.adapter.peg;

/**
 * 圆形桩，在新的接口中使用该圆形状，可以创建一个圆形桩的适配器
 * User: shijingui
 * Date: 2016/9/21
 */
public class RoundPeg implements IRoundPeg {
    @Override
    public void insertIntoRoundHole() {
        System.out.println("insert into round hole...");
    }
}
