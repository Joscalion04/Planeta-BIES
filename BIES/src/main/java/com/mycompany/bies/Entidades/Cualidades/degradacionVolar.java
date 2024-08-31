package com.mycompany.bies.Entidades.Cualidades;
import java.util.Random;
/**
 * Implementación de {@link degradacionStrategy} para manejar la degradación al volar.
 */
public class degradacionVolar implements degradacionStrategy{
    /**
     * Degrada el estado del insecto al volar, basado en el número de alas.
     * 
     * @param numAlas El número de alas del insecto.
     * @return Una cadena que describe el resultado de la degradación.
     */
    @Override
    public int degradar(int numAlas){
        Random random = new Random();

        int numeroAleatorio = random.nextInt(3); 
        int probabilidad = 1 / numAlas;
        if(numeroAleatorio == probabilidad){
            numAlas--;
            System.out.println(" pero perdio una ala, tiene " + numAlas + " alas restantes");
            return numAlas;
        }
        System.out.println(" sin perder una ala");
        return numAlas;
    } 
}
