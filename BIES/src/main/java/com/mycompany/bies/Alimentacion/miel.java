package com.mycompany.bies.Alimentacion;
/**
 * Representa un tipo específico de alimento, 'miel'.
 * Implementación de {@link Alimento}.
 */
public record Miel() implements Alimento{

    /**
     * Muestra una presentación del alimento 'miel'.
     */
    @Override
    public void sePresenta() {
        System.out.println("Soy miel");
    }

}