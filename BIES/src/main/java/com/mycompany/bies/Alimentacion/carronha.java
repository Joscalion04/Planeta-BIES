package com.mycompany.bies.Alimentacion;

import com.mycompany.bies.Entidades.Insecto;
import com.mycompany.bies.Entidades.SerNoVivo;

/**
 * Implementación de {@link Alimento} que representa un tipo específico de alimento, 'carronha'.
 */
public class Carronha extends SerNoVivo implements Alimento {
    private Insecto insectoOriginal;

    public Carronha(Insecto insectoOriginal) {
        this.insectoOriginal = insectoOriginal;
    }

    /*
     * Indica si la carroña es comestible por un insecto dado.
     * @param insecto El insecto que intenta comer la carroña.
     * @return true si el insecto puede comer la carroña, de lo contrario false.
     */
    @Override
    public boolean esComestiblePor(Insecto insecto) {
        return true;
    }

    /*
     * Muestra una presentación de la carroña.
     */
    @Override
    public void sePresenta() {
        System.out.println("Soy carroña de un " + insectoOriginal.getClass().getSimpleName());
    }
}
