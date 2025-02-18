package org.lesson.java.shop;

import java.util.Random;


public class Product {

    Random rand = new Random();

    int productNumber;
    String name;
    String description;
    float price;
    int iva;


    public Product(String name, String description, float price, int iva){
        this.name = name;
        this.description = description;
        this.price = price;
        this.iva = iva;
        this.productNumber = rand.nextInt(900) + 100;
        
        
    }
    
    public void showPrice(){
        
         System.out.println("Prezzo " + name + ": " + price + "€");
     };

     public void showIvaPrice(){
        float ivaPrice = price + (iva * price /100);
        System.out.println("Prezzo ivato: " + ivaPrice);
     };

     public void showExtendedName(){
        System.out.println("Nome: " + name);
        System.out.println("Nome del prodotto: " + name +"Codice: "+ productNumber );
     }

    
}


