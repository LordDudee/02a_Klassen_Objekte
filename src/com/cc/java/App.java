package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        Cat cat = new Cat(); // Referenzvariable = cat
        System.out.println("Blick von außen: " + cat);

        cat.tellYourAddress();
    }
    
}
