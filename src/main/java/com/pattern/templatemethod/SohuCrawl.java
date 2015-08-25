package com.pattern.templatemethod;

/**
 * <p/>
 * User : krisibm@163.com
 * Date: 2015/8/25
 * Time: 9:56
 */
public class SohuCrawl extends CrawlTemplate {

    @Override
    protected void download() {
        System.out.println("Sohu downlond.............");
    }

    @Override
    protected void pipeline() {
        System.out.println("Sohu pipeline.............");
    }

    @Override
    protected void filter() {
        System.out.println("Sohu filter.............");
    }
}
