package com.mycompany.bies.Entidades.Comportamientos;
import com.mycompany.bies.Entidades.degradacionCaminar;
import com.mycompany.bies.Entidades.degradacionStrategy;
import com.mycompany.bies.Entidades.serVivo;

public class CaminarDecorador extends InsectoDecorador {
    private int numPatas;
    private degradacionStrategy degradacion = new degradacionCaminar();

    public CaminarDecorador(serVivo decoratedInsecto, int numPatas) {
        super(decoratedInsecto);
        this.numPatas = numPatas;
    }

    @Override
    public void display(int accion) {
    }

    public void caminar() {
        if(numPatas>=2){
            System.out.print("Camina");
            System.out.println(degradacion.degradar(numPatas));
        }else{
            System.out.println("No puedo caminar");
        }
    }
}