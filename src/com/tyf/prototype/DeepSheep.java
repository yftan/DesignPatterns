package com.tyf.prototype;

import java.io.*;

public class DeepSheep implements Serializable, Cloneable {
    private String name;
    private Integer age;
    private String color;
    public DeepCloneableTarget deepCloneableTarget;// 引用类型

    public DeepSheep(String name, Integer age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    /**
     * TODO 深拷贝 - 方式 1 使用 重写clone() 方法
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    public DeepSheep clone() throws CloneNotSupportedException {
        DeepSheep ds = (DeepSheep) super.clone();
        ds.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();
        return ds;
    }

    /**
     * TODO 深拷贝 - 方式2 通过对象的序列化实现 (推荐)
     *
     * @return
     */
    public DeepSheep deepClone() {

        //创建流对象
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            //TODO 序列化
            // 下面这种写法原因：装饰类模式ObjectOutputStream只是装饰类，
            // 需要依赖实现同一接口的被装饰类
            bos = new ByteArrayOutputStream();
            //当前这个对象以对象流的方式输出
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);

            //TODO 反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            DeepSheep copyObj = (DeepSheep)ois.readObject();

            return copyObj;

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } finally {
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
