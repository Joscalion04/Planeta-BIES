package com.mycompany.bies.Entidades;
import com.mycompany.bies.Alimentacion.Alimento;
import com.mycompany.bies.Alimentacion.hongo;
import com.mycompany.bies.Entidades.Comportamientos.Acciones.CaminarDecorador;
import com.mycompany.bies.Entidades.Comportamientos.Acciones.InsectoDecorador;
/**
 * Representa una araña en el sistema, que es un tipo específico de {@link Insecto}.
 * Utiliza el patrón Decorador para aplicar la funcionalidad de caminar.
 */
public class Arana implements Insecto {
    private InsectoDecorador Decoraciones;

    /**
     * Crea una instancia de {@link Arana}.
     * Se aplica el decorador {@link CaminarDecorador} para proporcionar la funcionalidad de caminar.
     *
     * @param patas Número de patas de la araña.
     */
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