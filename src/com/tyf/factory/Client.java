package com.tyf.factory;

public class Client {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            final int a =i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    Person person = new Person();
                    person.setName("tyf" + a);
                    AnimalFactory.setPerson(person);
                    Dog dog = (Dog)AnimalFactory.getAnimal("dog");
                    Cat cat = (Cat)AnimalFactory.getAnimal("cat");
                    dog.setName("小黑");
                    dog.eat();
                    cat.setName("大橘");
                    cat.eat();
                }
            }).run();
        }

    }
}
