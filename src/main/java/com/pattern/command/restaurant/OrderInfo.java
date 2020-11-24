package com.pattern.command.restaurant;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 菜品订单信息
 * User: krisjin
 * Date: 2016/8/9
 */
public class OrderInfo {
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
