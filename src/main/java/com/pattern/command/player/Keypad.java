package com.pattern.command.player;

/**
 * 键盘(请求者角色)
 * User: shijingui
 * Date: 2016/8/3
 */
public class Keypad {

    private Command playCommand;
    private Command stopCommand;
    private Command rewindCommand;


    public Keypad(Command playCommand, Command stopCommand, Command rewindCommand) {
        this.playCommand = playCommand;
        this.stopCommand = stopCommand;
        this.rewindCommand = stopCommand;
    }

    public void play() {
        playCommand.execute();
    }

    public void stop() {
        stopCommand.execute();
    }

    public void rewwind() {
        rewindCommand.execute();
    }
}
