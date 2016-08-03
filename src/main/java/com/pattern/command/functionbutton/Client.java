package com.pattern.command.functionbutton;

/**
 * User: shijingui
 * Date: 2016/8/3
 */
public class Client {
    public static void main(String[] args) {
        FunctionButtonSettingWindow functionButtonSettingWindow = new FunctionButtonSettingWindow("功能键设置窗口");

        Command helpCmd = new HelpCommand();
        Command minimizeCmd = new MinimizeCommand();
        Command screenCmd = new ScreenCommand();

        FunctionButton functionButton1 = new FunctionButton("功能键1");
        FunctionButton functionButton2 = new FunctionButton("功能键2");
        FunctionButton functionButton3 = new FunctionButton("功能键3");

        functionButton1.setCommand(helpCmd);
        functionButton2.setCommand(minimizeCmd);
        functionButton3.setCommand(screenCmd);

        functionButtonSettingWindow.addFunctionButton(functionButton1);
        functionButtonSettingWindow.addFunctionButton(functionButton2);
        functionButtonSettingWindow.addFunctionButton(functionButton3);

        functionButtonSettingWindow.display();

        functionButton1.onclick();
        functionButton2.onclick();
        functionButton3.onclick();
    }
}
