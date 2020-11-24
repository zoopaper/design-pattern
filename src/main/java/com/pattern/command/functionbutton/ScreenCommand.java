package com.pattern.command.functionbutton;

/**
 * User: krisjin
 * Date: 2016/8/4
 */
public class ScreenCommand extends Command {
    private ScreenHandler screenHandler;

    public ScreenCommand() {
        this.screenHandler = new ScreenHandler();
    }

    @Override
    public void execute() {
        screenHandler.screenshot();
    }
}
