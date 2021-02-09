package com.tyf.factory;

public class Cat implements IAnimal {

    String name;

    Person person;

    Cat(Person person) {
        this.person = person;
    }

    @Override
    public void eat() {
        System.out.println(person.name + "带着【小猫】" + name +"去吃饭");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
