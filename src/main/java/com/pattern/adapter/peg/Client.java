package com.pattern.adapter.peg;

/**
 * User: krisjin
 * Date: 2016/9/21
 */
public class Client {
    public static void main(String[] args) {

        //本体实际业务执行
        Peg peg = new SquarePeg();
        peg.insertIntoHole();

        //适配器执行
        peg = new RoundPegAdapter(new RoundPegImpl());
        peg.insertIntoHole();
    }
}
