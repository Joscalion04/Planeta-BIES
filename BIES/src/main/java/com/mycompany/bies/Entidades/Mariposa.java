package com.mycompany.bies.Entidades;
import com.mycompany.bies.Alimentacion.Alimento;
import com.mycompany.bies.Alimentacion.miel;
import com.mycompany.bies.Alimentacion.carronha;
import com.mycompany.bies.Entidades.Comportamientos.Acciones.InsectoDecorador;
import com.mycompany.bies.Entidades.Comportamientos.Acciones.VolarDecorador;
/**
 * Representa una mariposa en el sistema, que es un tipo específico de {@link Insecto}.
 * Utiliza el patrón Decorador para aplicar la funcionalidad de volar.
 */
public class Mariposa implements Insecto {

    private boolean vivo;

    private InsectoDecorador Decoraciones;
    /**
     * Crea una instancia de {@link Mariposa}.
     * Se aplica el decorador {@link VolarDecorador} para proporcionar la funcionalidad de volar.
     *
     * @param alas Número de alas de la mariposa.
     */
    public Mariposa(int alas){
        vivo = true;
        Decoraciones = new VolarDecorador((serVivo) this, alas);
    }

    @Override
    public boolean display(int accion) {
        try{
            if (!vivo) {
                System.out.println("La mariposa no puede volar porque está muerta");
                return false;
            }
            if (accion == 1) {
                if(!Decoraciones.getDecorador(VolarDecorador.class).volar()){
                    morir();
                }
            }
        } catch (Exception e) {
            System.out.println("Ocurrió un error al ejecutar la acción: " + e.getMessage());
        }
        return true;
    }

    @Override
    public boolean comer(Alimento comida) {
        if (!vivo) {
            System.out.println("La mariposa no puede comer porque está muerta");
            return false;
        }
        if(comida instanceof miel){
            System.out.println("Estoy comiendo miel");
        }else{
            System.out.println("No puedo, no es miel");
        }
        return true;
    }

    @Override
    public carronha morir() {
        System.out.println("La mariposa ha muerto y se ha convertido en carroña");
        vivo = false;
        return new carronha(this);
    }
}