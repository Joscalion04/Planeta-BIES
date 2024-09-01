/*
* @author JOSEPH LEÓN CABEZAS – 118970244
 * @author JOSUÉ VINDAS PÉREZ – 402500090
 * @author MANUEL MORA SANDI - 119150694
 * @author DEREK ROJAS MENDOZA – 604740973
 *  @version 1.0
 * @since 2024
 * */
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
     /**
     * Verifica el estado de la mosca y la mata si no puede volar ni caminar.
     */
    private void verificarEstado() {
        if (!volar && !caminar) {
            morir();
        }
    }
/**
     * Permite a la mosca comer un alimento.
     *
     * @param comida El {@link Alimento} que la mosca intenta comer.
     * @return {@code true} si la araña puede comer el alimento; de lo contrario, {@code false}.
     */
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
/**
     * Permite a la mosca comer un {@link Insecto} muerto.
     *
     * @param insecto El {@link Insecto} que la mosca intenta comer.
     * @return {@code true} si la mosca puede comer el insecto; de lo contrario, {@code false}.
     */

    public boolean comer(Insecto insecto) {
        if (!vivo) {
            System.out.println("La mosca no puede comer porque está muerta");
            return false;
        }
        System.out.println("El insecto huyó");
        return false;
    }
    

    /**
     * Cambia el estado de la mosca a muerto y la convierte en carroña.
     *
     * @return Una instancia de {@link Carronha} que representa a la mosca muerta.
     */
    @Override
    public Carronha morir() {
        System.out.println("La mosca ha muerto y se ha convertido en carroña");
        vivo = false;
        return new Carronha(this);
    }
}