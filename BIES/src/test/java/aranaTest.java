import com.mycompany.bies.Alimentacion.Hongo;
import com.mycompany.bies.Alimentacion.Miel;
import com.mycompany.bies.Entidades.Arana;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class aranaTest {

    private Arana arana;

    @BeforeAll
    public static void present(){
        System.out.println("\n=========================TESTING PARA LA ARANA=========================\n");
    }

    @BeforeEach
    public void setUp() {
        arana = new Arana(8);
    }

    @Test
    public void testDisplayCaminar() {
        System.out.println("\n============== Test de caminar ==============\n");
        arana.display(1);
        System.out.println("\n============== Fin test de caminar ==============\n");
    }

    @Test
    public void testComerHongo() {
        System.out.println("\n============== Test de comer hongo ==============\n");
        Hongo comida = new Hongo();
        arana.comer(comida);
        System.out.println("\n============== Fin test de comer hongo ==============\n");
    }

    @Test
    public void testComerNoHongo() {
        System.out.println("\n============== Test de comer algo que no es hongo ==============\n");
        arana.comer(new Miel());
        System.out.println("\n============== Fin test de comer algo que no es hongo ==============\n");
    }

    @Test
    public void testMorir() {
        System.out.println("\n============== Test de morir ==============\n");
        boolean continuar = true;
        while (continuar) {
            // Simula la acción de caminar
            continuar = arana.display(1);
        }
        System.out.println("\n ==============Fin test de morir ==============\n");
    }

    
}
