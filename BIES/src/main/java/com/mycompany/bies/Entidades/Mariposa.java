/*
* @author JOSEPH LEÓN CABEZAS – 118970244
 * @author JOSUÉ VINDAS PÉREZ – 402500090
 * @author MANUEL MORA SANDI - 119150694
 * @author DEREK ROJAS MENDOZA – 604740973
 *  @version 1.0
 * @since 2024
 * */
package com.mycompany.bies.Entidades;
import com.mycompany.bies.Alimentacion.Alimento;
import com.mycompany.bies.Alimentacion.Miel;
import com.mycompany.bies.Alimentacion.Carronha;
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
  /**
     * Ejecuta una acción basada en el valor proporcionado.
     * Si la acción es volar, la mariposa intentará volar; de lo contrario, permanecerá inactiva.
     *
     * @param accion El código de la acción a realizar (1 para volar).
     * @return {@code true} si la acción se ejecutó correctamente; de lo contrario, {@code false}.
     */
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
 /**
     * Permite a la mariposa comer un alimento específico.
     * La mariposa solo puede comer miel.
     *
     * @param comida El {@link Alimento} que la mariposa intenta comer.
     * @return {@code true} si la mariposa puede comer el alimento; de lo contrario, {@code false}.
     */
    @Override
    public boolean comer(Alimento comida) {
        if (!vivo) {
            System.out.println("La mariposa no puede comer porque está muerta");
            return false;
        }
        if(comida instanceof Miel){
            System.out.println("Estoy comiendo miel");
        }else{
            System.out.println("No puedo, no es miel");
        }
        return true;
    }

    /**
     * Cambia el estado de la mariposa a muerto y la convierte en carroña.
     *
     * @return Una instancia de {@link Carronha} que representa a la mariposa muerta.
     */
    @Override
    public Carronha morir() {
        System.out.println("La mariposa ha muerto y se ha convertido en carroña");
        vivo = false;
        return new Carronha(this);
    }
}