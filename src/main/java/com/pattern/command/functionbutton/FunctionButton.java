package com.pattern.command.functionbutton;

/**
 * User: krisjin
 * Date: 2016/8/3
 */
public class FunctionButton {
    private String name;
    private Command command;

    public FunctionButton(String name) {
        this.name = name;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public String getName() {
        return name;
    }

    public void onclick() {
        System.out.println("点击功能键...");
        command.execute();
    }
}
