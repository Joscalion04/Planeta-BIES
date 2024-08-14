import com.mycompany.bies.Alimentacion.carronha;
import com.mycompany.bies.Entidades.Mosca;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class moscaTest {

    private Mosca mosca;

    @BeforeEach
    public void setUp() {
        mosca = new Mosca(6, 2);
    }

    @Test
    public void testDisplayVolar() {
        // Simula la acción de volar
        mosca.display(1);
    }

    @Test
    public void testDisplayCaminar() {
        // Simula la acción de caminar
        mosca.display(2);
    }

    @Test
    public void testComer() {
        carronha comida = new carronha();
        mosca.comer(comida);
    }
}