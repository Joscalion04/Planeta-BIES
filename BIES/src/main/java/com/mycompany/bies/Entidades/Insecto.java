package com.mycompany.bies.Entidades;

import com.mycompany.bies.Alimentacion.Alimento;
/**
 * Interfaz que representa un insecto en el sistema.
 * Los insectos deben implementar esta interfaz y proporcionar
 * comportamientos específicos para comer y mostrar detalles.
 */
interface Insecto extends serVivo {
    /**
     * Muestra una representación del insecto basado en una acción dada.
     *
     * @param accion Un entero que representa la acción a realizar.
     */
    @Override
    public void display(int accion);
    
    /**
     * Permite al insecto comer un tipo de alimento.
     *
     * @param comida El alimento que el insecto va a comer.
     */
    void comer(Alimento comida);
}
