package com.example;

public class Dog implements IAnimal {
    @Override
    public void speak() {
        System.out.println("woof");
    }
}
