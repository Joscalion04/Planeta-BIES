package com.mycompany.bies.Entidades.Comportamientos;
import com.mycompany.bies.Entidades.degradacionMotora;

public class volar implements VoladorStrategy{

    @Override
    public String volarr(int numAlas, degradacionMotora degradacionMotora){
        if(numAlas >= 2 ){
            return degradacionMotora.perderAla(numAlas);
        }else{
            return "no puede volar porque tiene menos de 2 alas";
        }    
    }
}
