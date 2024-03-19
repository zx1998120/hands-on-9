package com.example.test;

import com.example.AnimalFactory;

public class Test3 {
    public static void main(String[] args) {
        AnimalFactory animalFactory = new AnimalFactory();
        AnimalFactory animalFactory2 = new AnimalFactory();
        animalFactory.createAnimal("dog").speak();
        animalFactory2.createAnimal("cat").speak();
    }
}
