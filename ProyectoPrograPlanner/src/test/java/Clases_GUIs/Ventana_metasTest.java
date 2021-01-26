package Clases_GUIs;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ventana_metasTest {
    private Ventana_metas ventanaMetas;
    @BeforeEach
    void setUp() {
        this.ventanaMetas= new Ventana_metas();
    }

    @AfterEach
    void tearDown() {
        this.ventanaMetas= null;
    }

    @Test
    void validacionSoloNumeros() {

        boolean resultado = this.ventanaMetas.validacionSoloNumeros("5");
        assertTrue(resultado);
    }
    @Test
    void validacionSoloNumeros2() {

        boolean resultado = this.ventanaMetas.validacionSoloNumeros("a");
        assertFalse(resultado);
    }
    @Test
    void validacionSoloNumeros3() {

        boolean resultado = this.ventanaMetas.validacionSoloNumeros(null);
        assertTrue(resultado);
    }
}