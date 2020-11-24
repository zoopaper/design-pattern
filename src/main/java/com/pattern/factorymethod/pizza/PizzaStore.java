package com.pattern.factorymethod.pizza;

/**
 * 披萨店
 * User: krisjin
 * Date: 2016/7/27
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);

        //统一的加工流程
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    /**
     * 抽象的工厂方法，创建披萨
     *
     * @param type
     * @return
     */
    protected abstract Pizza createPizza(String type);
}
