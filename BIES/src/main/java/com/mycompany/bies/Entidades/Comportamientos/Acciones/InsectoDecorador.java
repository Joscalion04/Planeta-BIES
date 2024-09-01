/*
* @author JOSEPH LEÓN CABEZAS – 118970244
 * @author JOSUÉ VINDAS PÉREZ – 402500090
 * @author MANUEL MORA SANDI - 119150694
 * @author DEREK ROJAS MENDOZA – 604740973
 *  @version 1.0
 * @since 2024
 * */
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
/**
 * Realiza una acción en el insecto decorado basado en el código de acción proporcionado.
 * Este método delega la llamada al método `display` del insecto decorado.
 *
 * @param accion El código de la acción a realizar. La interpretación del código depende de la implementación del insecto decorado.
 * @return {@code true} si la acción se ejecutó correctamente en el insecto decorado; de lo contrario, {@code false}.
 */
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
