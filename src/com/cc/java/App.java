package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        Cat cat1 = new Cat("Grizabella", "white", 29); // Klasse --> Objekt / Instanz   // Referenzvariable = cat1 
        
        output("Blick von aussen: " + cat1);
        output("RAM-Adresse: " + cat1.getAddress());
        output("Name: " + cat1.getName());
        output("Fellfarbe: " + cat1.getFurColor());
        output("Alter: " + cat1.getAge());

        output("------------------------");

        Cat cat2 = new Cat("Alonzo", "black", 35); // Klasse --> Objekt / Instanz     // Referenzvariable = cat1 
        // cat2.setName("#?!3$");
        
        output("Blick von aussen: " + cat2);
        output("RAM-Adresse: " + cat2.getAddress());
        output("Name: " + cat2.getName());
        output("Fellfarbe: " + cat2.getFurColor());
        output("Alter: " + cat2.getAge());
    }

    public static void output(String outputStr){
        System.out.println(outputStr);
    }

}
