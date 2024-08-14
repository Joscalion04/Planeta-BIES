import com.mycompany.bies.Alimentacion.miel;
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
    public void testDisplay() {
        // Simula la acción de volar
        mariposa.display(1);
    }

    @Test
    public void testComer() {
        miel comida = new miel();
        mariposa.comer(comida);
    }
}