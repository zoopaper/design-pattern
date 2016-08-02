package com.pattern.command.player;

/**
 * User: shijingui
 * Date: 2016/8/3
 */
public class PlayCommand implements Command {

    private AudioPlayer audioPlayer;

    public PlayCommand(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    /**
     * 执行方法
     */
    @Override
    public void execute() {
        audioPlayer.play();
    }
}
