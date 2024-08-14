package com.mycompany.bies.Entidades;

import com.mycompany.bies.Alimentacion.Alimento;

interface Insecto extends serVivo {
    
    @Override
    public void display(int accion);
    void comer(Alimento comida);
}
