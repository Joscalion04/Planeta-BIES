package com.mycompany.bies.Entidades;
import com.mycompany.bies.Alimentacion.Alimento;
import com.mycompany.bies.Alimentacion.miel;
import com.mycompany.bies.Entidades.Comportamientos.InsectoDecorador;
import com.mycompany.bies.Entidades.Comportamientos.VolarDecorador;

public class Mariposa implements Insecto {

    private InsectoDecorador Decoraciones;

    public Mariposa(int alas){
        Decoraciones = new VolarDecorador((serVivo) this, alas);
    }

    @Override
    public void display(int accion) {
        if (accion == 1) {
            Decoraciones.getDecorador(VolarDecorador.class).volar();;
        }
    }

    @Override
    public void comer(Alimento comida) {
        if(comida instanceof miel){
            System.out.println("Estoy comiendo hongos");
        }else{
            System.out.println("No puedo, no son hongos");
        }
    }


}