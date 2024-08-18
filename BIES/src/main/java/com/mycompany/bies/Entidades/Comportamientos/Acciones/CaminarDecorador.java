package com.mycompany.bies.Entidades.Comportamientos.Acciones;
import com.mycompany.bies.Entidades.serVivo;
import com.mycompany.bies.Entidades.Cualidades.degradacionCaminar;
import com.mycompany.bies.Entidades.Cualidades.degradacionStrategy;
/**
 * Decorador que permite al insecto caminar, agregando la funcionalidad de caminar al insecto decorado.
 */
public class CaminarDecorador extends InsectoDecorador {
    private int numPatas;
    private degradacionStrategy degradacion = new degradacionCaminar();

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
    public void display(int accion) {}
     /**
     * Método para realizar la acción de caminar.
     * Si el insecto tiene al menos 2 patas, camina; de lo contrario, no puede caminar.
     */
    public void caminar() {
        if(numPatas>=2){
            System.out.print("Camina");
            System.out.println(degradacion.degradar(numPatas));
        }else{
            System.out.println("No puedo caminar");
        }
    }
}