package org.lesson.java.shop;

import java.util.Random;

public class Product {

    Random rand = new Random();

    private int productNumber;
    private String name;
    private String description;
    private float price;
    private int iva;

    public Product(String name, String description, float price, int iva) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.iva = iva;
        this.productNumber = rand.nextInt(900) + 100;

    }

    public int getProductNumber(){
        return this.productNumber;
    }


    public String getName(){
        return this.name;
    };

    public void setName( String name){
        this.name = name;
    };

    public String getDescription(){
        return this.name;
    };

    public void setDescription( String description){
        this.description = description;
    }

    public float getPrice() {

        return this.price;
    };

    public void setPrice(float price) {
        this.price = price;
    }

    public int getIva() {
        return this.iva;
    };

    public void setIva(int iva) {
       this.iva = iva;
    };

    public void getIvaPrice() {
        float ivaPrice = price + (iva * price / 100);
        System.out.println("Prezzo ivato: " + ivaPrice);
    };

    public void showExtendedName() {
        System.out.println("Nome: " + name);
        System.out.println("Nome del prodotto: " + name + "Codice: " + productNumber);
    };

};


