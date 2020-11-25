package com.pattern.adapter.peg;

/**
 * SquarePeg为具体目标的实现类
 * User: krisjin
 * Date: 2016/9/21
 */
public class SquarePeg implements Peg {
    @Override
    public void insertIntoHole() {
        System.out.println("insert into square hole...");
    }
}
