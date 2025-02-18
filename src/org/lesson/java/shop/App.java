package org.lesson.java.shop;

public class App {
    public static void main(String[] args){
        Product GranaPadano = new Product("GranaPadano", "Formaggio", 12,22 );


        System.out.println(GranaPadano.description);
        GranaPadano.showPrice();
        GranaPadano.showIvaPrice();
        GranaPadano.showExtendedName();
    }
}
