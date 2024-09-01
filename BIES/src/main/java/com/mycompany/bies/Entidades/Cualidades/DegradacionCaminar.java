package com.mycompany.bies.Entidades.Cualidades;
import java.util.Random;
/**
 * Implementación de {@link DegradacionStrategy} para manejar la degradación al caminar.
 */
public class DegradacionCaminar implements DegradacionStrategy{
    /**
     * Degrada el estado del insecto al caminar, basado en el número de patas.
     * 
     * @param numPatas El número de patas del insecto.
     * @return Una cadena que describe el resultado de la degradación.
     */
    @Override
    public int degradar(int numPatas){
        Random random = new Random();

        int numeroAleatorio = random.nextInt(4); 
        int probabilidad = 1 / numPatas;
        if(numeroAleatorio == probabilidad){
            numPatas--;
            System.out.println(" pero perdio una pata, tiene " + numPatas + " patas restantes");
            return numPatas;
        }
        System.out.println(" sin perder una pata");
        return numPatas;
    }     
    
}
