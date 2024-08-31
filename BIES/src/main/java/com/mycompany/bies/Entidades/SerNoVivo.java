package com.mycompany.bies.Entidades;

/**
 * Interfaz que representa un ser no vivo en el sistema.
 * Todos los seres no vivos deben implementar esta interfaz.
 * Los seres no vivos pueden ser consumidos por insectos.
 */
public abstract class SerNoVivo {
    public abstract boolean esComestiblePor(Insecto insecto);
}