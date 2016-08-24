package com.pattern.command.mvc1;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

/**
 * 抽象命令对象
 * User: shijingui
 * Date: 2016/8/10
 */
public abstract class Command {
    private static Class[] NO_ARGS_CLASS = new Class[0];
    private static Object[] NO_ARGS_OBJECT = new Object[0];
    protected RequestContext request;
    protected ResponseContext response;
    protected String templateName;
    protected Map context = new HashMap<>();

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    /**
     * 处理请求
     *
     * @param request
     * @param response
     * @param context
     * @return
     */
    public String process(RequestContext request, ResponseContext response, Map context) {
        this.request = request;
        this.response = response;
        this.context = context;
        String action = this.request.getAction();
        try {
            this.getClass().getMethod(action, NO_ARGS_CLASS).invoke(this, NO_ARGS_OBJECT);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
        return templateName;
    }

    public abstract void list();
}

