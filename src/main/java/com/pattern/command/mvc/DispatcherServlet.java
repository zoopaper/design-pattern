package com.pattern.command.mvc;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 请求调用分发器
 * User: shijingui
 * Date: 2016/8/9
 */
public class DispatcherServlet extends AbstractBaseServlet {
    HandlerCommand handlerCommand;
    public DispatcherServlet() {
        initConfig();
        initHandler();
        handlerCommand = new SimpleUrlHandlerCommand();
    }
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            HandlerExecutionChain handlerExecutionChain = getHandler(req);
            process(handlerExecutionChain.getHandler(), req, resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    protected HandlerExecutionChain getHandler(HttpServletRequest request) throws Exception {
        return handlerCommand.getHandler(request);
    }
    private void process(Object handler, HttpServletRequest req, HttpServletResponse resp) {
    }
}
