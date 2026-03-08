package ar.uba.fi.algo3.piedrapapeltijera;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class ReglasTest {

    private Peleable piedra = new Piedra();
    private Peleable papel = new Papel();
    private Peleable tijera = new Tijera();

    /**
     * PIEDRA
     */
    @Test
    public void piedraGanaTijera() {
        assertEquals(piedra, piedra.vs(tijera));
    }

    @Test
    public void piedraEmpataConPiedra() {
        assertEquals(piedra, piedra.vs(piedra));
    }

    @Test
    public void piedraPierdeConPapel() {
        assertEquals(papel, piedra.vs(papel));
    }

    /**
     * PAPEL
     */
    @Test
    public void papelGanaPiedra() {
        assertEquals(papel, papel.vs(piedra));
    }

    @Test
    public void papelEmpataConPapel() {
        assertEquals(papel, papel.vs(papel));
    }

    @Test
    public void papelPierdeConTijera() {
        assertEquals(tijera, papel.vs(tijera));
    }papel

    /**
     * TIJERA
     */
    @Test
    public void tijeraGanaPapel() {
        assertEquals(tijera, tijera.vs(papel));
    }

    @Test
    public void tijeraEmpataConTijera() {
        assertEquals(tijera, tijera.vs(tijera));
    }

    @Test
    public void tijeraPierdeConPiedra() {
        assertEquals(piedra, tijera.vs(piedra));
    }

}
