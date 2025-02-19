package org.lesson.java.shop;

public class App {
    public static void main(String[] args){
        Product GranaPadano = new Product("GranaPadano", "Formaggio", 12,22 );
        GranaPadano.setName("Grana");
        System.out.println(GranaPadano.getName());
        System.out.println(GranaPadano.getProductNumber());


        Studente Mario = new Studente("Mario", "Rossi", 20);

        System.out.println(Mario.getStudentInfo());


        ContoBancario MioConto = new ContoBancario(400);

        
        
        MioConto.deposita(1000);

        MioConto.preleva(540);
        
        System.out.println( MioConto.mostraSaldo());


        

    }
}
