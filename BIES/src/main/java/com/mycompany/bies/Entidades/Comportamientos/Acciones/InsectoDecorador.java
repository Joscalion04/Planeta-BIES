package com.mycompany.bies.Entidades.Comportamientos.Acciones;

import com.mycompany.bies.Entidades.serVivo;
/**
 * Clase abstracta que define un decorador de insectos, permitiendo agregar funcionalidades adicionales a un insecto.
 */
public abstract class InsectoDecorador implements serVivo {
    protected serVivo decoratedInsecto;

    /**
     * Crea un decorador para el insecto proporcionado.
     * 
     * @param decoratedInsecto El insecto al que se le agregará la funcionalidad adicional.
     */
    public InsectoDecorador(serVivo decoratedInsecto) {
        this.decoratedInsecto = decoratedInsecto;
    }

    @Override
    public boolean display(int accion) {
        return decoratedInsecto.display(accion);
    }
    
    /**
     * Verifica si el decorador actual o uno de sus decoradores tiene una instancia del tipo proporcionado.
     * 
     * @param decoradorClass La clase del decorador a verificar.
     * @return {@code true} si el decorador está presente, {@code false} en caso contrario.
     */
    public boolean hasDecorador(Class<?> decoradorClass) {
        if (decoradorClass.isInstance(this)) {
            return true;
        } else if (decoratedInsecto instanceof InsectoDecorador) {
            return ((InsectoDecorador) decoratedInsecto).hasDecorador(decoradorClass);
        }
        return false;    
    }

    /**
     * Obtiene el decorador de un tipo específico.
     * 
     * @param decoradorClass La clase del decorador a obtener.
     * @param <T> El tipo del decorador.
     * @return El decorador del tipo especificado, o {@code null} si no se encuentra.
     */
    public <T> T getDecorador(Class<T> decoradorClass) {
        if (decoradorClass.isInstance(this)) {
            return decoradorClass.cast(this);
        } else if (decoratedInsecto instanceof InsectoDecorador) {
            return ((InsectoDecorador) decoratedInsecto).getDecorador(decoradorClass);
        }
        return null;
    }

}
