package com.mycompany.bies.Entidades.Comportamientos;
import com.mycompany.bies.Entidades.degradacionStrategy;
import com.mycompany.bies.Entidades.degradacionVolar;
import com.mycompany.bies.Entidades.serVivo;

public class VolarDecorador extends InsectoDecorador {
    private int numAlas;
    private degradacionStrategy degradacion = new degradacionVolar();

    public VolarDecorador(serVivo decoratedInsecto, int numAlas) {
        super(decoratedInsecto);
        this.numAlas = numAlas;
    }

    public void volar() {
        if(numAlas >= 2){
            System.out.print("Vuela");
            System.out.println(degradacion.degradar(numAlas));
        }else{
            System.out.println("No puedo volar");
        }
    }

    @Override
    public void display(int accion) {
        volar();
    }


}
