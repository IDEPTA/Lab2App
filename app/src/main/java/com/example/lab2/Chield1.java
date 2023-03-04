package com.example.lab2;

public class Chield1 extends Dog{
    public Chield1(String species, int age) {
        super(species, age);
    }
    @Override public String say(){
        String text = "Hey i "+this.Species+"\nMy age: "+this.Age;
        return text;
    }
    public String Hru(){
      String text = "Hry!";
      return text;
    }
}
