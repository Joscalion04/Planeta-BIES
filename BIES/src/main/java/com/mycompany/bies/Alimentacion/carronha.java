package com.mycompany.bies.Alimentacion;
/**
 * Implementación de {@link Alimento} que representa un tipo específico de alimento, 'carronha'.
 */
public record carronha() implements Alimento{
    /**
     * Muestra una presentación del alimento 'carronha'.
     */
    @Override
    public void sePresenta() {
        System.out.println("Soy carronha");
    }

}