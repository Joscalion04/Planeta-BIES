/*
* @author JOSEPH LEÓN CABEZAS – 118970244
 * @author JOSUÉ VINDAS PÉREZ – 402500090
 * @author MANUEL MORA SANDI - 119150694
 * @author DEREK ROJAS MENDOZA – 604740973
 *  @version 1.0
 * @since 2024
 * */

package com.mycompany.bies;

import com.mycompany.bies.Alimentacion.Carronha;
import com.mycompany.bies.Alimentacion.Hongo;
import com.mycompany.bies.Alimentacion.Miel;
import com.mycompany.bies.Entidades.Arana;
import com.mycompany.bies.Entidades.Mariposa;
import com.mycompany.bies.Entidades.Mosca;

/**
 * Clase principal del proyecto BIES.
 * Esta clase contiene el método principal para ejecutar la aplicación.
 * 
 * @author JOSEPH LEÓN CABEZAS – 118970244
 * @author JOSUÉ VINDAS PÉREZ – 402500090
 * @author MANUEL MORA SANDI - 119150694
 * @author DEREK ROJAS MENDOZA – 604740973
 */
public class BIES {

     /**
     * Método principal que inicia la aplicación.
     * 
     * @param args Argumentos de la línea de comandos.
     */
    public static void main(String[] args) {
        // Crear insectos básicos
        Mariposa mariposa = new Mariposa(2);  // La mariposa tiene 2 alas
        Arana arana = new Arana(8);        // La araña tiene 8 patas
        Mosca mosca = new Mosca(2, 6);     // La mosca tiene 2 alas y 6 patas

        // Simular el entorno del planeta Bies
        System.out.println("=== Escenario del Planeta Bies ===\n");

        // Mostrar las características iniciales de los insectos
        System.out.println("Características iniciales de los insectos en el planeta Bies:");
        
        System.out.println("\nMariposa:");
        mariposa.display(1);  // Mostrar la mariposa volando

        System.out.println("\nAraña:");
        arana.display(1);     // Mostrar la araña caminando

        System.out.println("\nMosca:");
        mosca.display(1);     // Mostrar la mosca volando
        mosca.display(2);     // Mostrar la mosca caminando

        // Simular acciones de los insectos
        System.out.println("\n=== Simulación de acciones en el planeta Bies ===\n");

        System.out.println("La mariposa intenta volar...");
        mariposa.display(1);

        System.out.println("\nLa araña intenta caminar...");
        arana.display(1);

        System.out.println("\nLa mosca intenta volar y luego caminar...");
        mosca.display(1);
        mosca.display(2);

        // Simular el proceso de alimentación de los insectos
        System.out.println("\n=== Proceso de alimentación en el planeta Bies ===\n");

        System.out.println("La mariposa intenta comer miel...");
        mariposa.comer(new Miel());

        System.out.println("\nLa araña intenta comer un hongo...");
        arana.comer(new Hongo());

        System.out.println("\nLa mosca intenta comer carroña...");
        Carronha carronha = new Carronha(null);
        mosca.comer(carronha);

        // Continuar con acciones normales sin forzar degradación motora ni muerte
        System.out.println("\n=== Acciones continuas en el planeta Bies ===\n");

        System.out.println("La mariposa sigue volando...");
        mariposa.display(1);

        System.out.println("\nLa araña sigue caminando...");
        arana.display(1);

        System.out.println("\nLa mosca sigue volando y caminando...");
        mosca.display(1);
        mosca.display(2);

        System.out.println("\n=== Fin de la simulación en el planeta Bies ===\n");
    }
}
