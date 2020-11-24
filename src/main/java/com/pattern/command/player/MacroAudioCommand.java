package com.pattern.command.player;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * User: krisjin
 * Date: 2016/8/3
 */
public class MacroAudioCommand implements MacroCommand {
    private List commandList = Collections.synchronizedList(new ArrayList());

    /**
     * 移出命令
     *
     * @param command
     */
    @Override
    public void remove(Command command) {
        commandList.remove(command);
    }

    /**
     * 添加命令
     *
     * @param command
     */
    @Override
    public void add(Command command) {
        commandList.add(command);
    }

    /**
     * 执行方法
     */
    @Override
    public void execute() {
        Command nextCommand;
        System.out.println("Automated playback of stored commands....");
        for (int i = 0; i < commandList.size(); i++) {
            nextCommand = (Command) commandList.get(i);
            nextCommand.execute();
        }
        System.out.println("Finished automated playback of stored commands....");
    }
}
