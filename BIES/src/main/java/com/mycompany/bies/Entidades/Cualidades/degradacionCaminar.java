package com.mycompany.bies.Entidades.Cualidades;
import java.util.Random;
/**
 * Implementación de {@link degradacionStrategy} para manejar la degradación al caminar.
 */
public class degradacionCaminar implements degradacionStrategy{
    /**
     * Degrada el estado del insecto al caminar, basado en el número de patas.
     * 
     * @param numPatas El número de patas del insecto.
     * @return Una cadena que describe el resultado de la degradación.
     */
   @Override
    public String degradar(int numPatas){
        Random random = new Random();

        int numeroAleatorio = random.nextInt(4); 
        int probabilidad = 1 / numPatas;
        if(numeroAleatorio == probabilidad){
            return " pero perdio una pata";
        }
        return " sin perder una pata";
    }     
    
}
