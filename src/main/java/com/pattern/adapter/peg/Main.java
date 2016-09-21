package com.pattern.adapter.peg;

/**
 * User: shijingui
 * Date: 2016/9/21
 */
public class Main {
    public static void main(String[] args) {
        Peg peg = new SquarePeg();
        peg.insertIntoHole();
        peg = new RoundPegAdapter(new RoundPeg());
        peg.insertIntoHole();
    }
}
