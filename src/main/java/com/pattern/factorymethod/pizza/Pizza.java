package com.pattern.factorymethod.pizza;

import java.util.ArrayList;
import java.util.List;

/**
 * 披萨产品
 * User: krisjin
 * Date: 2016/7/27
 */
public abstract class Pizza {

    String name;
    /**
     * 面团
     */
    String dough;
    /**
     * 酱料
     */
    String sauce;
    /**
     * 配料
     */
    List toppings = new ArrayList();

    /**
     * 准备工作
     */
    void prepare() {

    }

    public String getName() {
        return name;
    }

    /**
     * 烘焙
     */
    void bake() {
    }

    /**
     * 切
     */
    void cut() {
    }


    /**
     * 装盒
     */
    void box() {
    }


}
