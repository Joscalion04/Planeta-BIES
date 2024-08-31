package com.mycompany.bies.Alimentacion;
/**
 * Implementación de {@link Alimento} que representa un tipo específico de alimento, 'hongo'.
 */
public record Hongo() implements Alimento{

    /**
     * Muestra una presentación del alimento 'hongo'.
     */
    @Override
    public void sePresenta() {
        System.out.println("Soy hongo");
    }

}