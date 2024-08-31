package com.mycompany.bies.Entidades.Comportamientos.Acciones;
import com.mycompany.bies.Entidades.serVivo;
import com.mycompany.bies.Entidades.Cualidades.DegradacionCaminar;
import com.mycompany.bies.Entidades.Cualidades.DegradacionStrategy;
/**
 * Decorador que permite al insecto caminar, agregando la funcionalidad de caminar al insecto decorado.
 */
public class CaminarDecorador extends InsectoDecorador {
    private int numPatas;
    private DegradacionStrategy degradacion = new DegradacionCaminar();

    /**
     * Crea un decorador que agrega la capacidad de caminar al insecto decorado.
     * 
     * @param decoratedInsecto El insecto al que se le agrega la capacidad de caminar.
     * @param numPatas El número de patas del insecto.
     */
    public CaminarDecorador(serVivo decoratedInsecto, int numPatas) {
        super(decoratedInsecto);
        this.numPatas = numPatas;
    }

    @Override
    public boolean display(int accion) {
        return caminar();
    }
     /**
     * Método para realizar la acción de caminar.
     * Si el insecto tiene al menos 2 patas, camina; de lo contrario, no puede caminar
     * @return true si el insecto puede caminar, false si no puede.
     */
    public boolean caminar() {
        if (numPatas >= 2) {
            System.out.print("Camina");
            numPatas = degradacion.degradar(numPatas);
            return true;
        } else {
            System.out.println("No puedo caminar");
            return false;
        }
    }
}