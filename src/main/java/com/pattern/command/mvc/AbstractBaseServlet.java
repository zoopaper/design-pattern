package com.pattern.command.mvc;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import java.util.ArrayList;
import java.util.List;

/**
 * User: krisjin
 * Date: 2016/8/9
 */
public abstract class AbstractBaseServlet extends HttpServlet {
    private List<Controller> controllerList;


    @Override
    public void init(ServletConfig config) throws ServletException {
            
    }

    public void initHandler() {
        this.controllerList = new ArrayList<Controller>();
    }
}
