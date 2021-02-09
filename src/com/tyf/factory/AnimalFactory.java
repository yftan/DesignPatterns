package com.tyf.factory;

public abstract class AnimalFactory {

    public static Person person;

    public abstract IAnimal createAnimal();

    public static IAnimal getAnimal(String type){
        if ("cat".equals(type)) {
            return new CatFactory().createAnimal();
        } else if("dog".equals(type) ){
            return new DogFactory().createAnimal();
        } else {
            return new DogFactory().createAnimal();
        }
    }

    public static Person getPerson() {
        return person;
    }

    public static void setPerson(Person person) {
        AnimalFactory.person = person;
    }
}
