package com.mycompany.bies.Entidades.Comportamientos;

import com.mycompany.bies.Entidades.serVivo;

public abstract class InsectoDecorador implements serVivo {
    protected serVivo decoratedInsecto;

    public InsectoDecorador(serVivo decoratedInsecto) {
        this.decoratedInsecto = decoratedInsecto;
    }

    @Override
    public void display(int accion) {
    }
    
    // Método para delegar llamadas a métodos específicos
    public boolean hasDecorador(Class<?> decoradorClass) {
        if (decoradorClass.isInstance(this)) {
            return true;
        } else if (decoratedInsecto instanceof InsectoDecorador) {
            return ((InsectoDecorador) decoratedInsecto).hasDecorador(decoradorClass);
        }
        return false;    
    }

    public <T> T getDecorador(Class<T> decoradorClass) {
        if (decoradorClass.isInstance(this)) {
            return decoradorClass.cast(this);
        } else if (decoratedInsecto instanceof InsectoDecorador) {
            return ((InsectoDecorador) decoratedInsecto).getDecorador(decoradorClass);
        }
        return null;
    }

}
