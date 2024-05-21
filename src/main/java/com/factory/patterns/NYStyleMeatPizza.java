package com.factory.patterns;

public class NYStyleMeatPizza extends Pizza {

    @Override
    public void getIngredients() {
        System.out.println("Meat pizza...");
    }

    @Override
    public String getName() {
        return "NY Style Meat Pizza";
    }
}
