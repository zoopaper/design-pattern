package com.pattern.command.functionbutton;

import java.util.ArrayList;
import java.util.List;

/**
 * User: shijingui
 * Date: 2016/8/3
 */
public class FunctionButtonSettingWindow {
    private String title;
    private List<FunctionButton> functionButtonList = new ArrayList();

    public FunctionButtonSettingWindow(String title) {
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void addFunctionButton(FunctionButton functionButton) {
        functionButtonList.add(functionButton);
    }

    public void removeFunctionButton(FunctionButton functionButton) {
        functionButtonList.remove(functionButton);
    }

    public void display() {
        System.out.println("显示窗口:" + title);
        System.out.println("显示功能键：");
        for (FunctionButton functionButton : functionButtonList) {
            System.out.println(functionButton.getName());
        }
    }
}
