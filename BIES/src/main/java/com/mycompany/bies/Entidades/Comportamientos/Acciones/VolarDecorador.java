/*
* @author JOSEPH LEÓN CABEZAS – 118970244
 * @author JOSUÉ VINDAS PÉREZ – 402500090
 * @author MANUEL MORA SANDI - 119150694
 * @author DEREK ROJAS MENDOZA – 604740973
 *  @version 1.0
 * @since 2024
 * */
package com.mycompany.bies.Entidades.Comportamientos.Acciones;
import com.mycompany.bies.Entidades.serVivo;
import com.mycompany.bies.Entidades.Cualidades.DegradacionStrategy;
import com.mycompany.bies.Entidades.Cualidades.DegradacionVolar;
/**
 * {@link InsectoDecorador}  que permite al insecto volar, agregando la funcionalidad de volar al insecto decorado.
 */
public class VolarDecorador extends InsectoDecorador {
    private int numAlas;
    private DegradacionStrategy degradacion = new DegradacionVolar();

    /**
     * Crea un decorador que agrega la capacidad de volar al insecto decorado.
     * 
     * @param decoratedInsecto El insecto al que se le agrega la capacidad de volar.
     * @param numAlas El número de alas del insecto.
     */
    public VolarDecorador(serVivo decoratedInsecto, int numAlas) {
        super(decoratedInsecto);
        this.numAlas = numAlas;
    }

     /**
     * Realiza la acción de volar.
     * Si el insecto tiene al menos 2 alas, vuela; de lo contrario, no puede volar.
     *
     * @return {@code true} si el insecto puede volar; {@code false} en caso contrario.
     */
    public boolean volar() {
        if (numAlas >= 2) {
            System.out.print("Vuela");
            numAlas = degradacion.degradar(numAlas);
            return true;
        } else {
            System.out.println("No puedo volar");
            return false;
        }
    }
  /**
     * Realiza una acción basada en el valor proporcionado.
     *
     * @param accion El código de la acción a realizar. En este caso, se utiliza para volar.
     * @return {@code true} si la acción se ejecutó correctamente; de lo contrario, {@code false}.
     */
    @Override
    public boolean display(int accion) {
        return volar();
    }
}
