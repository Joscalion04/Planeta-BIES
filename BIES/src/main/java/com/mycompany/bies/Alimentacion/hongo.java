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
