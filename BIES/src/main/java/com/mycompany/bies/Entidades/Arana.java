package com.mycompany.bies.Entidades;
import com.mycompany.bies.Alimentacion.Alimento;
import com.mycompany.bies.Alimentacion.hongo;
import com.mycompany.bies.Entidades.Comportamientos.CaminarDecorador;
import com.mycompany.bies.Entidades.Comportamientos.InsectoDecorador;

public class Arana implements Insecto {

    private InsectoDecorador Decoraciones;

    public Arana(int patas){
        Decoraciones = new CaminarDecorador((serVivo) this, patas);
    }

    @Override
    public void display(int accion) {
        if (accion == 1) {
            Decoraciones.getDecorador(CaminarDecorador.class).caminar();;
        }
    }

    @Override
    public void comer(Alimento comida) {
        if(comida instanceof hongo){
            System.out.println("Estoy comiendo hongos");
        }else{
            System.out.println("No puedo, no son hongos");
        }
    }

}