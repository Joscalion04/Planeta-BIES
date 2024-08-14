package com.mycompany.bies.Entidades.Comportamientos;
import com.mycompany.bies.Entidades.serVivo;
import java.util.Random;


public class CaminarDecorador extends InsectoDecorador {
    private int numPatas;

    public CaminarDecorador(serVivo decoratedInsecto, int numPatas) {
        super(decoratedInsecto);
        this.numPatas = numPatas;
    }

    @Override
    public void display(int accion) {
    }

    public void caminar() {
        degradacionMotora();
        if(numPatas>=2){
            System.out.println("Camina");
        }else{
            System.out.println("No puedo caminar");
        }
    }

    public void degradacionMotora(){
        if(new Random().nextInt(numPatas) == 0){
            numPatas--;
        }
    }

}