package com.ieschabas;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Test de la clase MenuVehiculos.
 */
public class MenuVehiculosTest {

    @Test
    void testOpcion1() {
        MenuVehiculos menuVehiculos = new MenuVehiculos();
        assertEquals("Mantenimiento de clientes", menuVehiculos.seleccionarOpcion(1));
    }

    @Test
    void testOpcion2() {
        MenuVehiculos menuVehiculos = new MenuVehiculos();
        assertEquals("Introducción de facturas", menuVehiculos.seleccionarOpcion(2));
    }

    @Test
    void testOpcion3() {
        MenuVehiculos menuVehiculos = new MenuVehiculos();
        assertEquals("Listado de facturas", menuVehiculos.seleccionarOpcion(3));
    }

    @Test
    void testOpcion4() {
        MenuVehiculos menuVehiculos = new MenuVehiculos();
        assertEquals("Finalizar", menuVehiculos.seleccionarOpcion(4));
    }

    @Test
    void testOpcionInvalida() {
        MenuVehiculos menuVehiculos = new MenuVehiculos();
        assertEquals("La opción no existe. Vuelve a intentarlo", menuVehiculos.seleccionarOpcion(7));
    }
}

