package com.pattern.facade;

/**
 * 外观模式体现了迪米特法则
 * User: shijingui
 * Date: 2016/9/21
 */
public class Main {

    public static void main(String[] args) {
        PersonAssistantFacade personAssistantFacade = new PersonAssistantFacade();
        personAssistantFacade.buyFinancialProducts();
        personAssistantFacade.eat();
    }
}
