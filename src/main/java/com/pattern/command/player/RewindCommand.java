package com.pattern.command.player;

/**
 * User: krisjin
 * Date: 2016/8/3
 */
public class RewindCommand implements Command {
    private AudioPlayer audioPlayer;

    public RewindCommand(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    /**
     * 执行方法
     */
    @Override
    public void execute() {
        audioPlayer.rewind();
    }
}
