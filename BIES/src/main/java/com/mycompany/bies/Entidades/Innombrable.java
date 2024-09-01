package com.mycompany.bies.Entidades;

import com.mycompany.bies.Alimentacion.Alimento;
import com.mycompany.bies.Alimentacion.Carronha;
import com.mycompany.bies.Entidades.Comportamientos.Acciones.CaminarDecorador;
import com.mycompany.bies.Entidades.Comportamientos.Acciones.InsectoDecorador;
import com.mycompany.bies.Entidades.Comportamientos.Acciones.VolarDecorador;
/**
     * * Representa un ser llamado 'Innombrable' que puede caminar y volar.
     * Se aplican los decoradores {@link CaminarDecorador} y {@link VolarDecorador}
     * para proporcionar las funcionalidades de caminar y volar.
     
     */

public class Innombrable implements Insecto {
     private boolean vivo;
    private boolean volar;
    private boolean caminar;
    
    private InsectoDecorador Decoraciones;
    /**
     
     * @param patas Número de patas del innombrable.
     * @param alas Número de alas del innombrable.
     */
    public Innombrable(int patas, int alas){
        vivo = true;
        volar = true;
        caminar = true;
        Insecto baseInsecto = this;
        Decoraciones = new VolarDecorador(new CaminarDecorador((serVivo) baseInsecto, patas), alas);
    }
 /**
     * Realiza una acción basada en el valor proporcionado.
     *
     * @param accion El código de la acción a realizar:
     *               1 representa la acción de volar, 2 representa la acción de caminar.
     * @return {@code true} si la acción se ejecutó correctamente; de lo contrario, {@code false}.
     */
    @Override
    public boolean display(int accion) {
        if (!vivo) {
            System.out.println("El ente no puede volar ni caminar porque está muerto");
            return false;
        }
        try {
            switch (accion) {
                case 1:
                    if (volar) {
                        if (!Decoraciones.getDecorador(VolarDecorador.class).volar()) {
                            volar = false;
                            verificarEstado();
                            return false;
                        }
                    } else {
                        System.out.println("No puedo volar");
                        verificarEstado();
                        return false;
                    }
                    break;
                case 2:
                    if (caminar) {
                        if (!Decoraciones.getDecorador(CaminarDecorador.class).caminar()) {
                            caminar = false;
                            verificarEstado();
                            return false;
                        }
                    } else {
                        System.out.println("No puedo caminar");
                        verificarEstado();
                        return false;
                    }
                    break;
                default:
                    System.out.println("Estoy Inmovil");
                    break;
            }
        } catch (Exception e) {
            System.out.println("Ocurrió un error al ejecutar la acción: " + e.getMessage());
        }
        return true;
    }
     /**
     * Verifica el estado del innombrable. Si no puede volar ni caminar, cambia su estado a muerto.
     */
    private void verificarEstado() {
        if (!volar && !caminar) {
            morir();
        }
    }
/**
     * Permite al innombrable comer un alimento.
     *
     * @param comida El {@link Alimento} que el innombrable intenta comer.
     * @return {@code true} si el innombrable puede comer el alimento; de lo contrario, {@code false}.
     */
    @Override
    public boolean comer(Alimento comida) {
        if (!vivo) {
            System.out.println("El ente no puede comer porque está muerto");
            return false;
        }
        System.out.println("El ente está comiendo");
        return true;
    }
/**
     * Permite al innombrable comer otro insecto.
     *
     * @param insecto El {@link Insecto} que el innombrable intenta comer.
     * @return {@code true} si el innombrable puede comer el insecto; de lo contrario, {@code false}.
     */
    public boolean comer(Insecto insecto) {
        if (!vivo) {
            System.out.println("El ente no puede comer porque está muerto");
            return false;
        }
        System.out.println("El ente está comiendo");
        return true;
    }
     /**
     * Cambia el estado del innombrable a muerto y lo convierte en carroña.
     *
     * @return Una instancia de {@link Carronha} que representa al innombrable muerto.
     */
   
    @Override
    public Carronha morir() {
        System.out.println("El ente ha muerto y se ha convertido en carroña");
        vivo = false;
        return new Carronha(this);
    }
}
