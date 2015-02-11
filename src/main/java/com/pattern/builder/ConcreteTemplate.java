package com.pattern.builder;

public class ConcreteTemplate implements TemplateBuilder {

	private Template ctx;
	private String templateHtml;

	public ConcreteTemplate(Template ctx, String templateHtml) {
		this.ctx = ctx;
		this.templateHtml = templateHtml;
	}

	@Override
	public TemplateBuilder title() {

		templateHtml = new TitleHandler().process(ctx, templateHtml);

		return this;
	}

	@Override
	public TemplateBuilder summary() {
		templateHtml = new TitleHandler().process(ctx, templateHtml);
		return this;
	}

	@Override
	public TemplateBuilder context() {
		templateHtml = new TitleHandler().process(ctx, templateHtml);
		return this;
	}

}
