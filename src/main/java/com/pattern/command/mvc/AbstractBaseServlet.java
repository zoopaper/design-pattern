package com.pattern.command.mvc;

import javax.servlet.http.HttpServlet;
import java.util.ArrayList;
import java.util.List;

/**
 * User: shijingui
 * Date: 2016/8/9
 */
public abstract class AbstractBaseServlet extends HttpServlet {
    private List<Controller> controllerList;

    public void initConfig() {

    }

    public void initHandler() {
        this.controllerList = new ArrayList<Controller>();
    }
}
