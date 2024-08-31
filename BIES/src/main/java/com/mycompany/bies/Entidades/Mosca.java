package com.mycompany.bies.Entidades;

import com.mycompany.bies.Alimentacion.Alimento;
import com.mycompany.bies.Alimentacion.Carronha;
import com.mycompany.bies.Entidades.Comportamientos.Acciones.CaminarDecorador;
import com.mycompany.bies.Entidades.Comportamientos.Acciones.InsectoDecorador;
import com.mycompany.bies.Entidades.Comportamientos.Acciones.VolarDecorador;
/**
 * Representa una mosca en el sistema, que es un tipo específico de {@link Insecto}.
 * Utiliza los patrones Decorador para aplicar las funcionalidades de caminar y volar.
 */
public class Mosca implements Insecto {

    private boolean vivo;
    private boolean volar;
    private boolean caminar;
    
    private InsectoDecorador Decoraciones;
    /**
     * Crea una instancia de {@link Mosca}.
     * Se aplican los decoradores {@link CaminarDecorador} y {@link VolarDecorador}
     * para proporcionar las funcionalidades de caminar y volar.
     *
     * @param patas Número de patas de la mosca.
     * @param alas Número de alas de la mosca.
     */
    public Mosca(int patas, int alas){
        vivo = true;
        volar = true;
        caminar = true;
        Insecto baseInsecto = this;
        Decoraciones = new VolarDecorador(new CaminarDecorador((serVivo) baseInsecto, patas), alas);
    }

    @Override
    public boolean display(int accion) {
        if (!vivo) {
            System.out.println("La mosca no puede volar ni caminar porque está muerta");
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
            System.out.println("La mosca no puede comer porque está muerta");
            return false;
        }
        if (comida instanceof Carronha) {
            Carronha carroña = (Carronha) comida;
            if (carroña.esComestiblePor(this)) {
                System.out.println("Estoy comiendo carroña");
                return true;
            } else {
                System.out.println("No puedo comer esto");
                return false;
            }
        } else {
            System.out.println("No puedo, no es carroña");
            return false;
        }
    }

    public boolean comer(Insecto insecto) {
        if (!vivo) {
            System.out.println("La mosca no puede comer porque está muerta");
            return false;
        }
        System.out.println("El insecto huyó");
        return false;
    }
    

    @Override
    public Carronha morir() {
        System.out.println("La mosca ha muerto y se ha convertido en carroña");
        vivo = false;
        return new Carronha(this);
    }
}