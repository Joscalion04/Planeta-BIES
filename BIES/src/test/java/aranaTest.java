import com.mycompany.bies.Alimentacion.hongo;
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
    public void testDisplay() {
        // Simula la acción de caminar
        arana.display(1);
    }

    @Test
    public void testComer() {
        hongo comida = new hongo();
        arana.comer(comida);
    }
}
