package com.pattern;

import com.pattern.templatemethod.CrawlTemplate;
import com.pattern.templatemethod.SohuCrawl;
import com.pattern.templatemethod.WeiboCrawl;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * <p/>
 * User : krisibm@163.com
 * Date: 2015/8/25
 * Time: 9:57
 */
public class TemplateMethodMain {

    @Test
    public void test() {
//        CrawlTemplate weibo = new WeiboCrawl();
//        CrawlTemplate sohu = new SohuCrawl();
//        weibo.crawl();
//        sohu.crawl();

        HashMap map = new HashMap();

        map.put("name2","jingui");
        map.put("name3","jingui");
        map.put("name4","jingui");
        map.put("name5","jingui");
        map.put("name6", "jingui");
        map.get("name");
        int name="name".hashCode();
        System.out.println(name&6);
        System.out.println(Integer.toBinaryString(5));
    }
}
