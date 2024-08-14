package com.mycompany.bies.Alimentacion;
public record carronha() implements Alimento{

    @Override
    public void sePresenta() {
        System.out.println("Soy carronha");
    }

}