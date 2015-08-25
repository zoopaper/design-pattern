package com.pattern;

import com.pattern.templatemethod.CrawlTemplate;
import com.pattern.templatemethod.SohuCrawl;
import com.pattern.templatemethod.WeiboCrawl;
import org.junit.Test;

/**
 * <p/>
 * User : krisibm@163.com
 * Date: 2015/8/25
 * Time: 9:57
 */
public class TemplateMethodTest {

    @Test
    public void test() {
        CrawlTemplate weibo = new WeiboCrawl();
        CrawlTemplate sohu = new SohuCrawl();
        weibo.crawl();
        sohu.crawl();
    }
}
