package com.mycompany.bies.Entidades;
/*
* @author JOSEPH LEÓN CABEZAS – 118970244
 * @author JOSUÉ VINDAS PÉREZ – 402500090
 * @author MANUEL MORA SANDI - 119150694
 * @author DEREK ROJAS MENDOZA – 604740973
 *  @version 1.0
 * @since 2024
 * */
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
