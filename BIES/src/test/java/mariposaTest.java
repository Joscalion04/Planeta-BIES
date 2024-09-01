import com.mycompany.bies.Alimentacion.Hongo;
import com.mycompany.bies.Alimentacion.Miel;
import com.mycompany.bies.Entidades.Mariposa;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class mariposaTest {

    private Mariposa mariposa;

    @BeforeEach
    public void setUp() {
        mariposa = new Mariposa(2);
    }

    @BeforeAll
    public static void present(){
        System.out.println("\n========================= TESTING PARA LA MARIPOSA =========================\n");
    }

    @Test
    public void testDisplayVolar() {
        System.out.println("\n============== Test de Volar ==============\n");
        mariposa.display(1);
        System.out.println("\n============== Fin test de Volar ==============\n");
    }

    @Test
    public void testComerMiel() {
        System.out.println("\n============== Test de comer Miel ==============\n");
        Miel comida = new Miel();
        mariposa.comer(comida);
        System.out.println("\n============== Fin Test de comer Miel ==============\n");
    }

    @Test
    public void testComerNoMiel() {
        System.out.println("\n============== Test de comer algo que no es miel ==============\n");
        mariposa.comer(new Hongo());
        System.out.println("\n============== Fin Test de comer algo que no es miel ==============\n");
    }

    @Test
    public void testMorir() {
        System.out.println("\n============== Test de morir ==============\n");
        boolean continuar = true;
        while (continuar) {
            // Simula la acción de volar
            continuar = mariposa.display(1);
        }
        System.out.println("\n============== Fin Test de morir ==============\n");
    }

}