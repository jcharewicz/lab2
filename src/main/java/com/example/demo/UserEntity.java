package com.example.demo;

public class UserEntity {
    private String name;
    private Integer age;
    public UserEntity() {

    }

    public UserEntity(String name, Integer age) {
        this.name = name;
        this.age = age;
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
}