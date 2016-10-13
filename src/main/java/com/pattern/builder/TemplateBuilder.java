package com.pattern.builder;

/**
 * @author krisjin
 * @date 2015-2-11
 */
public interface TemplateBuilder {

    public String templateHtml = "";

    public TemplateBuilder title();

    public TemplateBuilder summary();

    public TemplateBuilder context();

}
