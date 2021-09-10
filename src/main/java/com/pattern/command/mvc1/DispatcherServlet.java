package com.pattern.command.mvc1;

import com.pattern.command.mvc.AbstractBaseServlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.List;
import java.util.Map;

/**
 * 请求调用分发器
 * User: krisjin
 * Date: 2016/8/9
 */
public class DispatcherServlet extends AbstractBaseServlet {
    private List<Command> commandList;//无用

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestContext request = null;
        ResponseContext response = null;
        try {
            request = new WebRequestContext(req);
            response = new WebResponseContext(resp);
            String actionModule = request.getModule();
            String actionClazz = Config.getActionClass(actionModule);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void processCommand(RequestContext request, ResponseContext response, Map context, String moduleClass) throws Exception {
        Writer out = new BufferedWriter(new OutputStreamWriter(response.getOutputStream(), "UTF-8"));
        Command c = this.retrieveCommand(moduleClass);
        String template = c.process(request, response, context);
        out.flush();
    }

    private Command retrieveCommand(String actionClazz) throws Exception {
        return (Command) Class.forName(actionClazz).newInstance();
    }
}
