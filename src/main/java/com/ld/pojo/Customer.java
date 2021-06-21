package com.ld.pojo;

public class Customer {
    private String id;
    private String name;
    private int gender;
    private int age;
    private  String ordermethod;

    public Customer() {
    }

    public Customer(String id, String name, int gender, int age, String ordermethod) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.ordermethod = ordermethod;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getOrdermethod() {
        return ordermethod;
    }

    public void setOrdermethod(String ordermethod) {
        this.ordermethod = ordermethod;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", ordermethod='" + ordermethod + '\'' +
                '}';
    }
}
