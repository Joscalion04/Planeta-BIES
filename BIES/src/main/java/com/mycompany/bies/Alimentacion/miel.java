package com.mycompany.bies.Alimentacion;
/**
 * Implementación de {@link Alimento} que representa un tipo específico de alimento, 'miel'.
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