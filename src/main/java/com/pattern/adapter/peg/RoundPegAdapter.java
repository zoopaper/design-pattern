package com.pattern.adapter.peg;

/**
 * 适配器实现新的接口，通过组合的方式加入旧的接口
 * User: krisjin
 * Date: 2016/9/21
 */
public class RoundPegAdapter implements Peg {
    private RoundPeg roundPeg;

    /**
     * 构造函数注入
     *
     * @param roundPeg
     */
    public RoundPegAdapter(RoundPeg roundPeg) {
        this.roundPeg = roundPeg;
    }

    @Override
    public void insertIntoHole() {
        roundPeg.insertIntoRoundHole();
    }

}
