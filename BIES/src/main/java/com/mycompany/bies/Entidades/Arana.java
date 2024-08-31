package com.mycompany.bies.Entidades;
import com.mycompany.bies.Alimentacion.Alimento;
import com.mycompany.bies.Alimentacion.hongo;
import com.mycompany.bies.Alimentacion.carronha;
import com.mycompany.bies.Entidades.Comportamientos.Acciones.CaminarDecorador;
import com.mycompany.bies.Entidades.Comportamientos.Acciones.InsectoDecorador;
/**
 * Representa una araña en el sistema, que es un tipo específico de {@link Insecto}.
 * Utiliza el patrón Decorador para aplicar la funcionalidad de caminar.
 */
public class Arana implements Insecto {

    private boolean vivo;

    private InsectoDecorador Decoraciones;

    /**
     * Crea una instancia de {@link Arana}.
     * Se aplica el decorador {@link CaminarDecorador} para proporcionar la funcionalidad de caminar.
     *
     * @param patas Número de patas de la araña.
     */
    public Arana(int patas){
        vivo = true;
        Decoraciones = new CaminarDecorador((serVivo) this, patas);
    }

    @Override
    public boolean display(int accion) {
        try{
            if (!vivo) {
                System.out.println("La araña no puede caminar porque está muerta");
                return false;
            }
            if (accion == 1) {
                if (!Decoraciones.getDecorador(CaminarDecorador.class).caminar()) {
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
            System.out.println("La araña no puede comer porque está muerta");
            return false;
        }
        if(comida instanceof hongo){
            System.out.println("Estoy comiendo hongos");
        }else{
            System.out.println("No puedo, no son hongos");
        }
        return true;
    }

    @Override
    public carronha morir() {
        System.out.println("La araña ha muerto y se ha convertido en carroña");
        vivo = false;
        return new carronha(this);
    }
}