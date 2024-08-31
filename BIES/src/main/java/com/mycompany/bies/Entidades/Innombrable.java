package com.mycompany.bies.Entidades;

import com.mycompany.bies.Alimentacion.Alimento;
import com.mycompany.bies.Alimentacion.Carronha;
import com.mycompany.bies.Entidades.Comportamientos.Acciones.CaminarDecorador;
import com.mycompany.bies.Entidades.Comportamientos.Acciones.InsectoDecorador;
import com.mycompany.bies.Entidades.Comportamientos.Acciones.VolarDecorador;

public class Innombrable implements Insecto {
     private boolean vivo;
    private boolean volar;
    private boolean caminar;
    
    private InsectoDecorador Decoraciones;
    /**
     * Crea una instancia de {@link Innombrable}.
     * Se aplican los decoradores {@link CaminarDecorador} y {@link VolarDecorador}
     * para proporcionar las funcionalidades de caminar y volar.
     *
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
    
    private void verificarEstado() {
        if (!volar && !caminar) {
            morir();
        }
    }

    @Override
    public boolean comer(Alimento comida) {
        if (!vivo) {
            System.out.println("El ente no puede comer porque está muerto");
            return false;
        }
        System.out.println("El ente está comiendo");
        return true;
    }

    public boolean comer(Insecto insecto) {
        if (!vivo) {
            System.out.println("El ente no puede comer porque está muerto");
            return false;
        }
        System.out.println("El ente está comiendo");
        return true;
    }
    
    @Override
    public Carronha morir() {
        System.out.println("El ente ha muerto y se ha convertido en carroña");
        vivo = false;
        return new Carronha(this);
    }
}
