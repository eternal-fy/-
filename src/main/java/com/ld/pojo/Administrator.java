package com.ld.pojo;

public class Administrator {
    private int id;
    private String name;
    private int age;
    private int priority;

    public Administrator() {
    }

    public Administrator( String name, int age, int priority) {
        this.name = name;
        this.age = age;
        this.priority = priority;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Administrator{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", priority=" + priority +
                '}';
    }
}
