package com.pattern.builder;

/**
 * @author krisjin
 * @date 2015-2-11
 */
public class TemplateBootstrap {
	private Template ctx;
	private String templateHtml;

	public TemplateBootstrap(Template ctx, String templateHtml) {
		this.ctx = ctx;
		this.templateHtml = templateHtml;

	}

	public String generateTemplate() {

		TemplateBuilder tpl = new ConcreteTemplate(ctx, templateHtml);
		String tplHtml = tpl.title().summary().context().templateHtml;

		return tplHtml;
	}

}
