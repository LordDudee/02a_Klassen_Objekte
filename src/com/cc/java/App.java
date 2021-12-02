package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        Cat cat1 = new Cat(); // Klasse --> Objekt/Instanz (cat1)  //Referenzvariable = cat1
        System.out.println("Blick von außen: " + cat1);
        cat1.name = "Grizabella";
        cat1.age = 22;
        cat1.furColor = "white";
        cat1.tellYourAddress();
        System.out.println(cat1.name);
        System.out.println(cat1.age);
        System.out.println(cat1.furColor);

        System.out.println("----------------------------");

        Cat cat2 = new Cat(); // Klasse --> Objekt/Instanz (cat2) //Referenzvariable = cat2
        System.out.println("Blick von außen: " + cat2);
        cat2.name = "Alonzo";
        cat2.age = 24;
        cat2.tellYourAddress();
        cat2.furColor = "black";
        System.out.println(cat2.name);
        System.out.println(cat2.age);
        System.out.println(cat2.furColor);
    }
    
}
