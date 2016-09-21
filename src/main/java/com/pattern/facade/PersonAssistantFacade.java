package com.pattern.facade;

public class PersonAssistantFacade {

    private BankService bankService = null;
    private CookService cookService = null;

    public PersonAssistantFacade() {
        bankService = new BankService();
        cookService = new CookService();
    }

    public void eat() {
        cookService.cook();
    }

    public void buyFinancialProducts() {
        bankService.buy();
    }

}
