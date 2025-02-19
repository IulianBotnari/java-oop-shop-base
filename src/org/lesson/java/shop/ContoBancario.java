package org.lesson.java.shop;

public class ContoBancario {

    public int numeroDiConto;
    private int saldo = 0;

    public ContoBancario(int numeroDiConto) {
        this.numeroDiConto = numeroDiConto;
    
    };


    public void deposita(int deposito){
        this.saldo = deposito;
    }

    public void preleva(int importoPrelievo){
        this.saldo = this.saldo - importoPrelievo;
    }

    public int mostraSaldo(){
        return this.saldo;
    }

}
