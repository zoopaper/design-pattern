package com.pattern.command.mvc;

import javax.servlet.http.HttpServletRequest;

/**
 * User: krisjin
 * Date: 2016/8/9
 */
public interface HandlerCommand {

    HandlerExecutionChain getHandler(HttpServletRequest request) throws Exception;

}
