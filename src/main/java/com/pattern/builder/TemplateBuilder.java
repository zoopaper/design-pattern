package com.pattern.builder;

/**
 * @author krisjin
 * @date 2015-2-11
 */
public interface TemplateBuilder {

    String templateHtml = "";

    TemplateBuilder title();

    TemplateBuilder summary();

    TemplateBuilder context();

}
