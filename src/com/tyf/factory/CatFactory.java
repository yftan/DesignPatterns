package com.tyf.factory;

public class CatFactory extends AnimalFactory {
    @Override
    public IAnimal createAnimal() {
        Cat cat = new Cat(person);
        return cat;
    }
}
