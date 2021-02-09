package com.tyf.factory;

public class DogFactory extends AnimalFactory {
    @Override
    public IAnimal createAnimal() {
        Dog dog = new Dog(person);
        return dog;
    }
}

