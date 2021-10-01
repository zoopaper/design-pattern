package com.pattern.adapter.peg;

/**
 * 圆形桩，在新的接口中使用该圆形状，可以创建一个圆形桩的适配器
 */
public class RoundPegImpl implements RoundPeg {
    @Override
    public void insertIntoRoundHole() {
        System.out.println("Adaptee execute: insert into round hole...");
    }
}
