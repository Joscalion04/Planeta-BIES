/*
* @author JOSEPH LEÓN CABEZAS – 118970244
 * @author JOSUÉ VINDAS PÉREZ – 402500090
 * @author MANUEL MORA SANDI - 119150694
 * @author DEREK ROJAS MENDOZA – 604740973
 *  @version 1.0
 * @since 2024
 * */
package com.mycompany.bies.Entidades.Cualidades;
/**
 * Interfaz que define un método para manejar la degradación de un insecto basado en un número de extremidades.
 */
public interface DegradacionStrategy{
    /**
     * Degrada el estado del insecto basado en el número de extremidades.
     * 
     * @param numExtremidades El número de extremidades del insecto.
     * @return El numero de extremidades que le quedan al insecto
     */
    public int degradar(int numExtremidades);    
}
