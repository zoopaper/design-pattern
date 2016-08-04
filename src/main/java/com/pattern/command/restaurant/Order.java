package com.pattern.command.restaurant;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * User: shijingui
 * Date: 2016/8/4
 */
public class Order {
    private Map<Integer, String> foodMap = new ConcurrentHashMap<Integer, String>();

    public void addFood(Integer number, String name) {
        foodMap.put(number, name);
    }

    public void removeFood(Integer number) {
        foodMap.remove(number);
    }

    public Map getFoodMap() {
        return foodMap;
    }

}
