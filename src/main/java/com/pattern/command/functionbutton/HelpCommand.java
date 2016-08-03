package com.pattern.command.functionbutton;

/**
 * User: shijingui
 * Date: 2016/8/3
 */
public class HelpCommand extends Command {
    private HelperHandler helperHandler;

    public HelpCommand() {
        this.helperHandler = new HelperHandler();
    }

    @Override
    public void execute() {
        helperHandler.display();
    }
}
