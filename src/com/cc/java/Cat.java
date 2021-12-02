package com.cc.java;

public class Cat {
    
    public String name;
    public String furColor;
    public int age;

    public void tellYourAddress(){
        System.out.println("Blick von innen: " + this);  // Instanzvariable = this
    }

    public String tellYourName(){
        return this.name;
    }  
}
