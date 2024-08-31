package com.mycompany.bies.Entidades;

import com.mycompany.bies.Alimentacion.Alimento;
import com.mycompany.bies.Alimentacion.Carronha;
/**
 * Interfaz que representa un insecto en el sistema.
 * Los insectos deben implementar esta interfaz y proporcionar
 * comportamientos específicos para comer y mostrar detalles.
 */
public interface Insecto extends serVivo {
    /**
     * Muestra una representación del insecto basado en una acción dada.
     *
     * @param accion Un entero que representa la acción a realizar.
     */
    @Override
    public boolean display(int accion);
    
    /**
     * Permite al insecto comer un tipo de alimento.
     *
     * @param comida El alimento que el insecto va a comer.
     */
    boolean comer(Alimento comida);

    /*
     * Maneja la muerte del insecto, convirtiéndolo en carronha.
     * 
     * @return El objeto carronha que representa la muerte del insecto.
    */
    public Carronha morir();
}
