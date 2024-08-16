package com.mycompany.bies.Entidades.Comportamientos;
import com.mycompany.bies.Entidades.degradacionMotora;
import com.mycompany.bies.Entidades.serVivo;


public class CaminarDecorador extends InsectoDecorador {
    private int numPatas;
    private caminarStrategy caminanteStrategy = new caminar();

    public CaminarDecorador(serVivo decoratedInsecto, int numPatas) {
        super(decoratedInsecto);
        this.numPatas = numPatas;
    }

    @Override
    public void display(int accion) {
    }

    public void caminar() {
        String resultado = caminanteStrategy.caminarr(numPatas, new degradacionMotora());
        System.out.println(resultado);
    }

}