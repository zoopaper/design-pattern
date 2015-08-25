package com.pattern.templatemethod;

/**
 * 模板类
 * <p/>
 * User : krisibm@163.com
 * Date: 2015/8/25
 * Time: 9:47
 */
public abstract class CrawlTemplate {


    protected abstract void download();

    protected abstract void pipeline();

    protected abstract void filter();

    /**
     * 模板方法
     */
    public void crawl() {
        download();
        pipeline();
        filter();
    }
}
