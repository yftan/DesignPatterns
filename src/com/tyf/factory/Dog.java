package com.tyf.factory;

public class Dog implements IAnimal {

    Person person;

    Dog(Person person) {
        this.person = person;
    }

    String name;

    @Override
    public void eat() {
        System.out.println(person.name + "带着【小狗】" + name +"去吃饭");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
