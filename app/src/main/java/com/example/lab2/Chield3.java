package com.example.lab2;

public class Chield3 extends Dog{
    public Chield3(String species, int age) {
        super(species, age);
    }
    @Override public String say(){
        String text = "Hey i "+this.Species+"\nMy age: "+this.Age;
        return text;
    }
    public String Gav(){
        String text = "Gav! Gav! Gav!";
        return text;
    }
}
