package com.mycompany.bies.Entidades.Cualidades;
/**
 * Interfaz que define un método para manejar la degradación de un insecto basado en un número de extremidades.
 */
public interface degradacionStrategy{
    /**
     * Degrada el estado del insecto basado en el número de extremidades.
     * 
     * @param numExtremidades El número de extremidades del insecto.
     * @return El numero de extremidades que le quedan al insecto
     */
    public int degradar(int numExtremidades);    
}
