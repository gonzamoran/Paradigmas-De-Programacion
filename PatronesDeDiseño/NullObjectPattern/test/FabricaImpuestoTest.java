import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;


public class FabricaImpuestoTest {

    private final double DELTA = 0.00001;

    @Test
    public void testCreacionDeImpuestoXCorrecto(){

        var impuesto = FabricaImpuesto.ObtenerImpuesto("X");

        assertNotNull(impuesto);
        assertEquals("Impuesto X", impuesto.getDescripcion());
        assertEquals(105, impuesto.aplicar(100), DELTA);
    }

    @Test
    public void testCreacionDeImpuestoYCorrecto(){

        Impuesto impuesto = FabricaImpuesto.ObtenerImpuesto("Y");

        assertNotNull(impuesto);
        assertEquals("Impuesto Y", impuesto.getDescripcion());
        assertEquals(110, impuesto.aplicar(100), DELTA);

    }

    @Test
    public void testAplicarImpuestosSeguidosAMonto100SeObtiene115(){
        var impuesto = FabricaImpuesto.ObtenerImpuesto("X");
        var impuesto2 = FabricaImpuesto.ObtenerImpuesto("Y");

        double monto = 100;

        monto = impuesto2.aplicar(monto);
        monto = impuesto.aplicar(monto);

        assertEquals(115.5, monto, DELTA);
    }

    @Test
    public void testAplicarImpuestosSeguidosConImpuestoDesconcidoAMonto100SeObtiene115(){
        var tiposImpuestos = new String[] { "X", "Z", "Y", "W", null};

        double monto = 100;

        for (var tipo: tiposImpuestos) {
            var impuesto = FabricaImpuesto.ObtenerImpuesto(tipo);
            monto = impuesto.aplicar(monto);
        }

        assertEquals(115.5, monto, DELTA);
    }
}
