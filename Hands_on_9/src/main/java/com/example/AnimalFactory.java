package com.example;

public class AnimalFactory {
    public  IAnimal createAnimal(String animalType) {
        switch (animalType.toLowerCase()) {
            case "dog":
                return new Dog();
            case "cat":
                return new Cat();
            default:
                throw new IllegalArgumentException("Invalid animal type: " + animalType);
        }
    }
}
