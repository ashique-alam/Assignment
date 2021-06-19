package com.ashique.AssignmentCollection;

public class Person {

    int weight;
    double height;
    String name;

    public Person(int weight, double height, String name) {
        this.weight = weight;
        this.height = height;
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
