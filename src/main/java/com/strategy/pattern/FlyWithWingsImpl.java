package com.strategy.pattern;

public class FlyWithWingsImpl implements FlyBehavior{

    @Override
    public void fly(){
        System.out.println("Beating wings.");
    }
}