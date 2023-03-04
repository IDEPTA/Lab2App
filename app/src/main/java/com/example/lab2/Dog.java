package com.example.lab2;

public abstract class Dog {
    public String Species;
    public int Age;
    public Dog(String species,int age){
        this.Species = species;
        this.Age = age;
    }
    public abstract String say();
}

