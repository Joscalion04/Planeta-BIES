package com.mycompany.bies.Entidades;
import java.util.Random;

public class degradacionVolar implements degradacionStrategy{
   
    @Override
    public String degradar(int numAlas){
        Random random = new Random();

        int numeroAleatorio = random.nextInt(3); 
        int probabilidad = 1 / numAlas;
        if(numeroAleatorio == probabilidad){
            return " pero perdio una ala";
        }
        return " sin perder una ala";
    } 
}
