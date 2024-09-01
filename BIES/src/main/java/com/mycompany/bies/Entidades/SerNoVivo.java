package com.mycompany.bies.Entidades;

/**
 * Interfaz que representa un ser no vivo en el sistema.
 * Todos los seres no vivos deben implementar esta interfaz.
 * Los seres no vivos pueden ser consumidos por insectos.
 */
public abstract class SerNoVivo {
      /**
     * Determina si un insecto puede consumir este ser no vivo.
     *
     * @param insecto El {@link Insecto} que intenta consumir el ser no vivo.
     * @return {@code true} si el ser no vivo es comestible para el insecto; de lo contrario, {@code false}.
     */
    public abstract boolean esComestiblePor(Insecto insecto);
}