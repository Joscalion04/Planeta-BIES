/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bies;

import com.mycompany.bies.Entidades.Arana;
import com.mycompany.bies.Entidades.Mariposa;
import com.mycompany.bies.Entidades.Mosca;
import com.mycompany.bies.Entidades.serVivo;

/**
 *
 * @author jgame
 */
public class BIES {

    public static void main(String[] args) {
        // Crear insectos básicos
        serVivo mariposa = new Mariposa(2);
        serVivo arana = new Arana(8);
        serVivo mosca = new Mosca(2,6);

        // Mostrar los insectos
        System.out.println("Características de la mariposa:");
        mariposa.display(1);

        System.out.println("\nCaracterísticas de la araña:");
        arana.display(1);

        System.out.println("\nCaracterísticas de la mosca:");
        mosca.display(1);
        mosca.display(2);
    }
}
