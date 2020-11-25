package com.pattern;

import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * @author krisjin
 * @date 2020/11/24
 */
public class F {
    private String name;
    private String type;

    public F(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public static void main(String[] args) {
        List<F> fList = new ArrayList<>();
        fList.add(new F("f1", "double"));
        fList.add(new F("f2", "double"));
        fList.add(new F("f3", "double"));
        fList.add(new F("f4", "double"));
        fList.add(new F("f5", "double"));

        System.out.println(JSONObject.toJSONString(fList));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
