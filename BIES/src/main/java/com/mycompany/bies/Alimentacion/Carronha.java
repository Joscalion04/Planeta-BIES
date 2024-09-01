/*
* @author JOSEPH LEÓN CABEZAS – 118970244
 * @author JOSUÉ VINDAS PÉREZ – 402500090
 * @author MANUEL MORA SANDI - 119150694
 * @author DEREK ROJAS MENDOZA – 604740973
 *  @version 1.0
 * @since 2024
 * */
package com.mycompany.bies.Alimentacion;

import com.mycompany.bies.Entidades.Insecto;
import com.mycompany.bies.Entidades.SerNoVivo;

/**
 * Representa un tipo específico de alimento, 'carronha', que es la carroña de un insecto.
 * Implementa la interfaz {@link Alimento}.
 */
public class Carronha extends SerNoVivo implements Alimento {
    private final Insecto insectoOriginal;

    /**
     * Crea una instancia de {@code Carronha} a partir de un insecto original.
     *
     * @param insectoOriginal El insecto del cual se origina la carroña.
     */
    public Carronha(Insecto insectoOriginal) {
        this.insectoOriginal = insectoOriginal;
    }

    /**
     * Indica si la carroña es comestible por un insecto dado.
     *
     * @param insecto El insecto que intenta comer la carroña.
     * @return {@code true} si el insecto puede comer la carroña, de lo contrario {@code false}.
     */
    @Override
    public boolean esComestiblePor(Insecto insecto) {
        return true;
    }

    /**
     * Muestra una presentación de la carroña.
     */
    @Override
    public void sePresenta() {
        System.out.println("Soy carroña de un " + insectoOriginal.getClass().getSimpleName());
    }
}
