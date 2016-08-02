package com.pattern.command.player;

/**
 * 录音机(接收者角色)
 * User: shijingui
 * Date: 2016/8/3
 */
public class AudioPlayer {

    /**
     * 播放
     */
    public void play() {
        System.out.println("录音机播放....");
    }

    /**
     * 停止
     */
    public void stop() {
        System.out.println("录音机停止....");
    }

    /**
     * 倒带
     */
    public void rewind() {
        System.out.println("录音机倒带....");
    }
}
