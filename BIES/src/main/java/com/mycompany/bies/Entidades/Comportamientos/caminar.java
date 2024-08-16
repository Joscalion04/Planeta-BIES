package com.mycompany.bies.Entidades.Comportamientos;  
import com.mycompany.bies.Entidades.degradacionMotora;  

public class caminar implements caminarStrategy {
    @Override
    public String caminarr(int numPatas, degradacionMotora degradacionMotora){
        if(numPatas >= 2 ){
            return degradacionMotora.perderPata(numPatas);
        }else{
            return "no puede caminar porque tiene menos de 2 patas";
       }
    }
}
