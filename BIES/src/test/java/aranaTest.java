import com.mycompany.bies.Alimentacion.hongo;
import com.mycompany.bies.Alimentacion.miel;
import com.mycompany.bies.Entidades.Arana;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class aranaTest {

    private Arana arana;

    @BeforeEach
    public void setUp() {
        arana = new Arana(8);
    }

    @Test
    public void testDisplayCaminar() {
        System.out.println("=========================\nTest de caminar\n");
        arana.display(1);
        System.out.println("\nFin test de tejer\n=========================");
    }

    @Test
    public void testComerHongo() {
        System.out.println("=========================\nTest de comer hongo\n");
        hongo comida = new hongo();
        arana.comer(comida);
        System.out.println("\nFin test de comer\n=========================");
    }

    @Test
    public void testComerNoHongo() {
        System.out.println("=========================\nTest de comer algo que no es hongo\n");
        arana.comer(new miel());
        System.out.println("\nFin test de comer\n=========================");
    }

    @Test
    public void testMorir() {
        System.out.println("=========================\nTest de morir\n");
        boolean continuar = true;
        while (continuar) {
            // Simula la acción de caminar
            continuar = arana.display(1);
        }
        System.out.println("\nFin test de morir\n=========================");
    }
}
