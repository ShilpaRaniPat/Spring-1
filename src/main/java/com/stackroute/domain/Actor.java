package com.stackroute.domain;

public class Actor {
    private String Name;
    private String Gender;
    private int Age;

    public String getName() {
        return Name;
    }

    public Actor(){}

     Actor(String name, String gender, int age) {
        Name = name;
        Gender = gender;
        Age = age;
    }

    public void setName(String name) {
        Name = name;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "Name='" + Name + '\'' +
                ", Gender='" + Gender + '\'' +
                ", Age=" + Age +
                '}';
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }


    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

}
