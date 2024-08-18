package com.mycompany.bies.Entidades;
import com.mycompany.bies.Alimentacion.Alimento;
import com.mycompany.bies.Alimentacion.miel;
import com.mycompany.bies.Entidades.Comportamientos.Acciones.InsectoDecorador;
import com.mycompany.bies.Entidades.Comportamientos.Acciones.VolarDecorador;
/**
 * Representa una mariposa en el sistema, que es un tipo específico de {@link Insecto}.
 * Utiliza el patrón Decorador para aplicar la funcionalidad de volar.
 */
public class Mariposa implements Insecto {

    private InsectoDecorador Decoraciones;
    /**
     * Crea una instancia de {@link Mariposa}.
     * Se aplica el decorador {@link VolarDecorador} para proporcionar la funcionalidad de volar.
     *
     * @param alas Número de alas de la mariposa.
     */
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