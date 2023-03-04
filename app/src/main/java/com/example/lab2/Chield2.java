package com.example.lab2;

public class Chield2 extends Dog {
    public Chield2(String species, int age) {
        super(species, age);
    }
    @Override public String say(){
        String text = "Hey i "+this.Species+"\nMy age: "+this.Age;
        return text;
    }
    public String R(){
        String text = "RRRrrr!";
        return text;
    }
}
