import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.mycompany.bies.Alimentacion.Alimento;
import com.mycompany.bies.Alimentacion.Carronha;
import com.mycompany.bies.Alimentacion.Miel;
import com.mycompany.bies.Entidades.Mariposa;
import com.mycompany.bies.Entidades.Innombrable;

public class innombrableTest {
    
    private Innombrable innombrable;

    @BeforeEach
    public void setUp() {
        innombrable = new Innombrable(4, 4);
    }

    @BeforeAll
    public static void present(){
        System.out.println("\n=========================TESTING PARA EL INOMBRABLE=========================\n");
    }

    @Test
    public void testDisplayVolar() {
        System.out.println("\n============== Test de Volar ==============\n");
        // Simula la acción de volar
        innombrable.display(1);
        System.out.println("\n============== Fin test de Volar ==============\n");
    }

    @Test
    public void testDisplayCaminar() {
        System.out.println("\n============== Test de caminar ==============\n");
        // Simula la acción de caminar
        innombrable.display(2);
        System.out.println("\n============== Fin test de caminar ==============\n");
    }

    @Test
    public void testDisplayMorir() {
        System.out.println("\n============== Test de morir ==============\n");
        boolean continuar = true;
        while (continuar) {
            // Simula la acción de volar
            continuar = innombrable.display(1);
        }
        continuar = true;
        while (continuar) {
            // Simula la acción de caminar
            continuar = innombrable.display(2);
        }
        System.out.println("\n============== Fin de Test de morir ==============\n");
    }

    @Test
    public void testComerInsectoMuerto() {
        System.out.println("\n============== Test de comer insecto muerto (Carronha) ==============\n");

        System.out.println("\nSe crea una mariposa y se hace que muera\n");
        Mariposa mariposa = new Mariposa(2);
        Carronha carroñaMariposa = mariposa.morir();  // Se fuerza la muerte de la mariposa
        carroñaMariposa.sePresenta();

        System.out.println("\nEl Innombrable intenta comer la mariposa muerta\n");
        boolean resultado = innombrable.comer((Alimento) carroñaMariposa);
        assert resultado == true : "El Innombrable debería poder comer la mariposa muerta";

        System.out.println("\n============== Fin Test de comer insecto muerto (Carronha) ==============\n");
    }

    @Test
    public void testComerInsectoVivo() {
        System.out.println("\n============== Test de comer insecto vivo ==============\n");

        System.out.println("\nSe crea una mariposa\n");
        Mariposa mariposa = new Mariposa(2);

        System.out.println("\nEl Innombrable intenta comer la mariposa\n");
        boolean resultado = innombrable.comer(mariposa);
        assert resultado == true : "El Innombrable debería poder comer la mariposa";

        System.out.println("\n============== Fin Test de comer insecto vivo ==============\n");
    }

    @Test
    public void testComerNoCarronha() {
        System.out.println("\n============== Test de comer algo que no es carroña ==============\n");

        innombrable.comer(new Miel());
        System.out.println("\n============== Fin Test de comer algo que no es carroña ==============\n");
    }

}
