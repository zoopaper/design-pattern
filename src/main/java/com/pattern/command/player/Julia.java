package com.pattern.command.player;

/**
 * 客户端
 * User: shijingui
 * Date: 2016/8/3
 */
public class Julia {
    //定义请求者
    private static Keypad keypad;
    //定义接收者
    private static AudioPlayer audioPlayer = new AudioPlayer();

    public static void main(String[] args) {
        Command playCmd = new PlayCommand(audioPlayer);
        Command stopCmd = new StopCommand(audioPlayer);
        Command rewindCmd = new RewindCommand(audioPlayer);

        keypad = new Keypad(playCmd, stopCmd, rewindCmd);

        keypad.play();
        keypad.stop();
        keypad.rewwind();
        System.out.println("-------------------------------------------分割线-------------------------------------------");
        macroTest();
    }

    public static void macroTest() {
        Command playCmd = new PlayCommand(audioPlayer);
        Command stopCmd = new StopCommand(audioPlayer);
        Command rewindCmd = new RewindCommand(audioPlayer);
        MacroCommand macro = new MacroAudioCommand();

        macro.add(playCmd);
        macro.add(stopCmd);
        macro.remove(stopCmd);
        macro.add(rewindCmd);
        macro.add(playCmd);
        macro.add(stopCmd);

        macro.execute();
    }
}
