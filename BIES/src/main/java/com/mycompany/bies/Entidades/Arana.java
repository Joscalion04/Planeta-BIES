package com.mycompany.bies.Entidades;
import com.mycompany.bies.Alimentacion.Alimento;
import com.mycompany.bies.Alimentacion.Hongo;
import com.mycompany.bies.Alimentacion.Carronha;
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
/**
     * Realiza una acción basada en el valor proporcionado.
     *
     * @param accion El código de la acción a realizar.
     *               Por ejemplo, 1 representa la acción de caminar.
     * @return {@code true} si la acción se ejecutó correctamente; de lo contrario, {@code false}.
     */
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
  /**
     * Permite a la araña comer un alimento.
     *
     * @param comida El {@link Alimento} que la araña intenta comer.
     * @return {@code true} si la araña puede comer el alimento; de lo contrario, {@code false}.
     */
    @Override
    public boolean comer(Alimento comida) {
        if (!vivo) {
            System.out.println("La araña no puede comer porque está muerta");
            return false;
        }
        if(comida instanceof Hongo){
            System.out.println("Estoy comiendo hongos");
        }else{
            System.out.println("No puedo, no son hongos");
        }
        return true;
    }
/**
     * Cambia el estado de la araña a muerta y la convierte en carroña.
     *
     * @return Una instancia de {@link Carronha} que representa la araña muerta.
     */
    @Override
    public Carronha morir() {
        System.out.println("La araña ha muerto y se ha convertido en carroña");
        vivo = false;
        return new Carronha(this);
    }
}