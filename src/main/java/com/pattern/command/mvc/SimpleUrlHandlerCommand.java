package com.pattern.command.mvc;

import javax.servlet.http.HttpServletRequest;

/**
 * User: shijingui
 * Date: 2016/8/9
 */
public class SimpleUrlHandlerCommand implements HandlerCommand {
    @Override
    public HandlerExecutionChain getHandler(HttpServletRequest request) throws Exception {
        return null;
    }
}
