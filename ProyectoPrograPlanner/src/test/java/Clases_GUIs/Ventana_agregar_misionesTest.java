package Clases_GUIs;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class Ventana_agregar_misionesTest {

    private Ventana_agregar_misiones ventanaAgregarMisiones;


    @BeforeEach
    void setUp() {
        ventanaAgregarMisiones= new Ventana_agregar_misiones();
    }

    @AfterEach
    void tearDown() {
        ventanaAgregarMisiones= null;
    }

}