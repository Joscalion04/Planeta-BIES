package com.mycompany.bies.Alimentacion;
public record miel() implements Alimento{

    @Override
    public void sePresenta() {
        System.out.println("Soy miel");
    }

}