package com.mycompany.bies.Entidades.Comportamientos;
import com.mycompany.bies.Entidades.degradacionMotora;
import com.mycompany.bies.Entidades.serVivo;


public class VolarDecorador extends InsectoDecorador {
    private int numAlas;
    VoladorStrategy voladorStrategy = new volar();

    public VolarDecorador(serVivo decoratedInsecto, int numAlas) {
        super(decoratedInsecto);
        this.numAlas = numAlas;
    }

    public void volar() {
        String resultado = voladorStrategy.volarr(numAlas, new degradacionMotora());
        System.out.println(resultado);
    }

    @Override
    public void display(int accion) {
        volar();
    }
}
