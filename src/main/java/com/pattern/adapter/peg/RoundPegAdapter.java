package com.pattern.adapter.peg;

/**
 * 适配器实现新的接口，通过组合的方式加入旧的接口
 * User: shijingui
 * Date: 2016/9/21
 */
public class RoundPegAdapter implements Peg {
    private IRoundPeg roundPeg;

    public RoundPegAdapter(IRoundPeg roundPeg) {
        this.roundPeg = roundPeg;
    }

    @Override
    public void insertIntoHole() {
        roundPeg.insertIntoRoundHole();
    }
}
