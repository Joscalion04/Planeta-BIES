import com.mycompany.bies.Alimentacion.Hongo;
import com.mycompany.bies.Alimentacion.Miel;
import com.mycompany.bies.Entidades.Mariposa;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class mariposaTest {

    private Mariposa mariposa;

    @BeforeEach
    public void setUp() {
        mariposa = new Mariposa(2);
    }

    @Test
    public void testDisplayVolar() {
        System.out.println("=========================\nTest de volar\n");
        mariposa.display(1);
        System.out.println("\nFin test de volar\n=========================");
    }

    @Test
    public void testComerMiel() {
        System.out.println("=========================\nTest de comer\n");
        Miel comida = new Miel();
        mariposa.comer(comida);
        System.out.println("\nFin test de comer\n=========================");
    }

    @Test
    public void testComerNoMiel() {
        System.out.println("=========================\nTest de comer algo que no es miel\n");
        mariposa.comer(new Hongo());
        System.out.println("\nFin test de comer\n=========================");
    }

    @Test
    public void testMorir() {
        System.out.println("=========================\nTest de morir\n");
        boolean continuar = true;
        while (continuar) {
            // Simula la acción de volar
            continuar = mariposa.display(1);
        }
        System.out.println("\nFin test de morir\n=========================");
    }
}