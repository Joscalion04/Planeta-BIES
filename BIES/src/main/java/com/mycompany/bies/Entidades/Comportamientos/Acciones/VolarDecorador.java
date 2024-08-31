package com.mycompany.bies.Entidades.Comportamientos.Acciones;
import com.mycompany.bies.Entidades.serVivo;
import com.mycompany.bies.Entidades.Cualidades.DegradacionStrategy;
import com.mycompany.bies.Entidades.Cualidades.DegradacionVolar;
/**
 * Decorador que permite al insecto volar, agregando la funcionalidad de volar al insecto decorado.
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
     * Método para realizar la acción de volar.
     * Si el insecto tiene al menos 2 alas, vuela; de lo contrario, no puede volar.
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

    @Override
    public boolean display(int accion) {
        return volar();
    }
}
