package ar.edu.uba.fi;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Unit test for simple App.
 */
public class AlgoBabyTest {
    /**
     * Calcular el costo total y el nivel de procesamiento de un AlgoBaby
     * armado con 2 módulos i3 y 3 módulos i5.
     */
    @Test
    public void case01() {
        AlgoBaby a = new AlgoBaby();
        a.armar(new Basico(2));
        a.armar(new Intermedio(3));

        Double costo = a.costo();
        assertEquals(new Double(3400), costo);

        Double procesamiento = a.procesamiento();
        assertEquals(new Double(13), procesamiento);
    }

    /**
     * Calcular el costo total y el nivel de procesamiento de un AlgoBaby
     * armado con 3 módulos i3, 2 módulos i5 y 1 módulo i7.
     */
    @Test
    public void case02() {
        AlgoBaby a = new AlgoBaby();
        a.armar(new Basico(3));
        a.armar(new Intermedio(2));

        assertThrows(AlgoBabyFull.class, () -> {
            a.armar(new Avanzado(1));
        });
    }

    /**
     * Calcular el costo total y el nivel de procesamiento de un AlgoBaby
     * armado 4 módulos i5 y 1 módulo i7,.
     */
    @Test
    public void case03() {
        AlgoBaby a = new AlgoBaby();
        a.armar(new Intermedio(4));
        a.armar(new Avanzado(1));

        assertThrows(Sobrecalentamiento.class, () -> {
            a.procesamiento();
        });
    }

}
