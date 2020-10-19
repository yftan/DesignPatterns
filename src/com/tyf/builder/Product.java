package com.tyf.builder;

/**
 * Builder建造者模式：builder模式也叫建造者模式，builder模式的作用将一个复杂对象的构建与他的表示分离，
 * 使用者可以一步一步的构建一个比较复杂的对象。我们通常构造一个有很多参数的对象时有三种方式：构造器重载，
 * JavaBeans模式和builder模式。通过一个小例子我们来看一下builder模式的优势。
 *
 * 可以看到builder模式将属性定义为不可变的，然后定义一个内部静态类Builder来构建属性，再通过一个只有Builder参数的构造器来生成Product对象。
 * Builder的setter方法返回builder本身，以便可以将属性连接起来。我们就可以像下面这样使用了。
 *
 * 参考地址：https://www.cnblogs.com/scuwangjun/p/9699895.html
 */

public class Product {
    private final int id;
    private final String name;
    private final int type;
    private final float price;

    private Product(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.type = builder.type;
        this.price = builder.price;
    }

    public static class Builder {
        private int id;
        private String name;
        private int type;
        private float price;

        public Builder id ( int id) {
            this.id = id;
            return this;
        }

        public Builder name ( String name ) {
            this.name = name;
            return this;
        }

        public Builder type ( int type) {
            this.type = type;
            return this;
        }

        public Builder price ( float price ) {
            this.price = price;
            return this;
        }

        public Product build() {
            return new Product(this);
        }
    }
}
