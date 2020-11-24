package com.pattern.prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * User: krisjin
 * Date: 2016/9/20
 */
public class PackageInfoCache {
    private static final Map<String, PackageInfo> packageCache = new HashMap<String, PackageInfo>();

    static {
        PackageInfo packageInfo = new PackageInfo();
        packageInfo.setAddress("朝阳");
        packageInfo.setId(111);
        packageInfo.setFromName("北京");
        packageInfo.setToName("上海");
        packageInfo.setTelephone("1111111111111");

        packageCache.put("jingui", packageInfo);
    }

    public static PackageInfo get(Object key) {
        return packageCache.get(key);
    }
}
