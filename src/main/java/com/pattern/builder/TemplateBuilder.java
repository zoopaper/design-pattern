package com.pattern.builder;

/**
 * @author krisjin
 * @date 2015-2-11
 */
public interface TemplateBuilder {
	
	public String templateHtml="";

	/**
	 * 构建模板的标题
	 * 
	 * @param ctx
	 * @param html
	 */
	public TemplateBuilder title();

	/**
	 * 构建模板摘要
	 * 
	 * @param ctx
	 * @param html
	 */
	public TemplateBuilder summary();

	/**
	 * 构建模板内容
	 * 
	 * @param ctx
	 * @param html
	 */
	public TemplateBuilder context();

}
