package com.pattern.adapter.peg;

/**
 * 定义一个适配者接口IRoundPeg，具体的适配者实现，要继承它，为什么要这么设计呢
 * 适配者也完全可以定义为具体的类，当动手实践的时候，要是这么做的话，发现阅读性不好，
 * 当然还是看实际的场景需要，选择是接口定义还是具体实现类，多思考一下
 * <p>
 * User: krisjin
 * Date: 2016/9/21
 */
public interface RoundPeg {

    void insertIntoRoundHole();

}
