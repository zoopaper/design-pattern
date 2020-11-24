package com.pattern.adapter.peg;

/**
 * User: krisjin
 * Date: 2016/9/21
 */
public class SquarePeg implements Peg {
    @Override
    public void insertIntoHole() {
        System.out.println("insert into square hole...");
    }
}
