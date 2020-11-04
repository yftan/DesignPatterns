package com.tyf.prototype;

public class Client {
    public static void main(String[] args) {
        // 原始方法,复制多个对象
        Sheep sheep = new Sheep("Tom",10,"白色");

        Sheep sheep1 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());

        Sheep sheep2 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());

        Sheep sheep3 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());

        System.out.println("sheep：" + sheep);
        System.out.println("sheep1：" + sheep1);
        System.out.println("sheep2：" + sheep2);
        System.out.println("sheep3：" + sheep3);

        // 原型方法
        SheepPrototype sheepP = new SheepPrototype("jack",10,"黑色");
        try {
            SheepPrototype sheepP1 = sheepP.clone();
            SheepPrototype sheepP2 = sheepP.clone();
            SheepPrototype sheepP3 = sheepP.clone();
            System.out.println("sheepP1：" + sheepP);
            System.out.println("sheepP2：" + sheepP1);
            System.out.println("sheepP3：" + sheepP2);
            System.out.println("sheepP4：" + sheepP3);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
