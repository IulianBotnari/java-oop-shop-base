package org.lesson.java.shop;

public class App {
    public static void main(String[] args){
        Product GranaPadano = new Product("GranaPadano", "Formaggio", 12,22 );
        GranaPadano.setName("Grana");
        System.out.println(GranaPadano.getName());
        System.out.println(GranaPadano.getProductNumber());


        Studente Mario = new Studente("Mario", "Rossi", 20);

        System.out.println(Mario.getStudentInfo());
        

    }
}
