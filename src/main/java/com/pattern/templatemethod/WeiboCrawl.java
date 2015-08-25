package com.pattern.templatemethod;

/**
 * <p/>
 * User : krisibm@163.com
 * Date: 2015/8/25
 * Time: 9:53
 */
public class WeiboCrawl extends CrawlTemplate {


    @Override
    protected void download() {
        System.out.println("weibo downlond.............");
    }

    @Override
    protected void pipeline() {
        System.out.println("weibo pipeline.............");
    }

    @Override
    protected void filter() {
        System.out.println("weibo filter.............");
    }


}
