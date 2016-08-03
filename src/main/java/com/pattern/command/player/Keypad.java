package com.pattern.command.player;

/**
 * 键盘(请求者角色),封装了请求命令
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
        this.rewindCommand = rewindCommand;
    }

    public void play() {
        playCommand.execute();
    }

    public void stop() {
        stopCommand.execute();
    }

    public void rewind() {
        rewindCommand.execute();
    }
}
