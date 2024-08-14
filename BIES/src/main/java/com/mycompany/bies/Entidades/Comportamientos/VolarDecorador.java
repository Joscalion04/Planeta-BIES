package com.mycompany.bies.Entidades.Comportamientos;
import com.mycompany.bies.Entidades.serVivo;
import java.util.Random;


public class VolarDecorador extends InsectoDecorador {
    private int numAlas;

    public VolarDecorador(serVivo decoratedInsecto, int numAlas) {
        super(decoratedInsecto);
        this.numAlas = numAlas;
    }

    public void volar() {
        degradacionMotora();
        if(numAlas>=2){
            System.out.println("Vuela");
        }else{
            System.out.println("No puedo volar");
        }
    }

    @Override
    public void display(int accion) {
        volar();
    }

    public void degradacionMotora(){
        if(new Random().nextInt(numAlas) == 0){
            numAlas--;
        }
    }
}
