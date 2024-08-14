package com.mycompany.bies.Entidades;

import com.mycompany.bies.Alimentacion.Alimento;
import com.mycompany.bies.Alimentacion.carronha;
import com.mycompany.bies.Entidades.Comportamientos.CaminarDecorador;
import com.mycompany.bies.Entidades.Comportamientos.InsectoDecorador;
import com.mycompany.bies.Entidades.Comportamientos.VolarDecorador;

public class Mosca implements Insecto {
    
    private InsectoDecorador Decoraciones;

    public Mosca(int patas, int alas){
        Insecto baseInsecto = this;
        Decoraciones = new VolarDecorador(new CaminarDecorador((serVivo) baseInsecto, patas), alas);
    }

    @Override
    public void display(int accion) {
        try {
            switch (accion) {
                case 1:
                    Decoraciones.getDecorador(VolarDecorador.class).volar();
                    break;
                case 2:
                    Decoraciones.getDecorador(CaminarDecorador.class).caminar();;
                    break;
                default:
                    System.out.println("Estoy Inmovil");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Ocurrió un error al ejecutar la acción: " + e.getMessage());
        }
    }

    @Override
    public void comer(Alimento comida) {
        if(comida instanceof carronha){
            System.out.println("Estoy comiendo hongos");
        }else{
            System.out.println("No puedo, no son hongos");
        }
    }
}