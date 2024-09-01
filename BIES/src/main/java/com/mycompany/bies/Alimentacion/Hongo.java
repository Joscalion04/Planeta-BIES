/*
* @author JOSEPH LEÓN CABEZAS – 118970244
 * @author JOSUÉ VINDAS PÉREZ – 402500090
 * @author MANUEL MORA SANDI - 119150694
 * @author DEREK ROJAS MENDOZA – 604740973
 *  @version 1.0
 * @since 2024
 * */
package com.mycompany.bies.Alimentacion;

/**
 * Representa un tipo específico de alimento, 'hongo'.
 * Implementa la interfaz {@link Alimento}.
 */
public record Hongo() implements Alimento {

    /**
     * Muestra una presentación del alimento 'hongo'.
     */
    @Override
    public void sePresenta() {
        System.out.println("Soy hongo");
    }
}
