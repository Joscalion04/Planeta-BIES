package com.mycompany.bies.Alimentacion;
public record hongo() implements Alimento{

    @Override
    public void sePresenta() {
        System.out.println("Soy hongo");
    }

}