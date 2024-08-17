package com.mycompany.bies.Entidades;
import java.util.Random;

public class degradacionCaminar implements degradacionStrategy{
    
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
