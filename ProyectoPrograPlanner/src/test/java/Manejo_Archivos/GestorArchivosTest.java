package Manejo_Archivos;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GestorArchivosTest {
    private GestorArchivos gestorArchivos;

    @BeforeEach
    void setUp() {
        this.gestorArchivos=new GestorArchivos();
    }

    @AfterEach
    void tearDown() {
        this.gestorArchivos=null;
    }

    @Test
    void quitarNumero() {
        String esperado = " Completar tarea de historia";
        assertEquals(esperado,this.gestorArchivos.quitarNumero("23| Completar tarea de historia"));

    }
    @Test
    void quitarNumero1() {
        String esperado = " Terminar el trabajo de programación";
        assertEquals(esperado,this.gestorArchivos.quitarNumero("1| Terminar el trabajo de programación"));

    }
}