package com.mycompany.bies.Entidades;
import java.util.Random;

public class degradacionMotora extends noVivos{
    public String perderAla(int numAlas){

        Random random = new Random();

        int numeroAleatorio = random.nextInt(4); 
        int probabilidad = 1 / numAlas;
        if(numeroAleatorio == probabilidad){
            return "perdio una ala";
        }
        return "volo sin perder una ala";
    }

    public String perderPata(int numPatas){

        Random random = new Random();

        int numeroAleatorio = random.nextInt(3); 
        int probabilidad = 1/numPatas;
        if(numeroAleatorio == probabilidad){
            return "perdio una pata";
        }
        return "camino sin perder una pata";
    }
}