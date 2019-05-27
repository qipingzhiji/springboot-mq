package com.springboot.helloworld.entity;

import java.io.Serializable;

public class Dog implements Serializable{

    private static final long serialVersionUID = 6245915588030980098L;
    private String name;
    private int age;

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
