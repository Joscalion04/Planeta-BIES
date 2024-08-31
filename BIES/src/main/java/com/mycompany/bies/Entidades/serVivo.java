package com.mycompany.bies.Entidades;
/**
 * Interfaz que representa un ser vivo en el sistema.
 * Todos los seres vivos deben implementar esta interfaz.
 */
public interface serVivo {
    /**
     * Muestra una representación del ser vivo basado en una acción dada.`
     *
     * @param accion Un entero que representa la acción a realizar.
     */
    boolean display(int accion);
}
