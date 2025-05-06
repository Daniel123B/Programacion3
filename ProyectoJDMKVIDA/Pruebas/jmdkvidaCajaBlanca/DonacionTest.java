package ProyectoJDMKVIDA.Pruebas.jmdkvidaCajaBlanca;

import org.junit.Before;
import org.junit.Test;

import ProyectoJDMKVIDA.jmdkvida.*;

import static org.junit.Assert.*;

public class DonacionTest {
    private Donante donante;
    private Donacion donacion;

    @Before
    public void setUp() {
        donante = new Donante("D001", "Donante Test", "donante@test.com", "don123", "Tarjeta de Crédito");
        donacion = new Donacion(donante, 100.0);
    }

    @Test
    public void testGenerarComprobante() {
        String comprobante = donacion.generarComprobante();
        assertNotNull(comprobante);
        assertTrue(comprobante.contains("Comprobante de donación"));
        assertTrue(comprobante.contains("Donante: " + donante.getNombre()));
        assertTrue(comprobante.contains("Monto: $" + donacion.getMonto()));
    }
}
