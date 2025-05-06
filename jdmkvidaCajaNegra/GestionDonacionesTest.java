package jdmkvidaCajaNegra;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import jmdkvida.Donante;
import jmdkvida.Donacion;

public class GestionDonacionesTest {

    
    private Donante donante;
    private Donacion donacion;
    
    @Before
    public void setUp() {
        donante = new Donante("D001", "María Rodríguez", "maria@empresa.com", "don101", "Transferencia bancaria");
    }
    
    /**
     * Prueba de caja negra para verificar el proceso de realización de donaciones
     */
    @Test
    public void testRealizarDonacion() {
        // Estado inicial
        assertEquals(0, donante.getDonaciones().size());
        
        // Realizamos una donación
        double monto = 100.0;
        donacion = donante.realizarDonacion(monto);
        
        // Verificamos que se haya registrado correctamente
        assertNotNull("La donación no debería ser nula", donacion);
        assertEquals(1, donante.getDonaciones().size());
        assertEquals(donante, donacion.getUsuario());
        assertEquals(monto, donacion.getMonto(), 0.001);
        assertNotNull("La fecha de la donación no debería ser nula", donacion.getFecha());
    }
    
    /**
     * Prueba de caja negra para verificar la generación de comprobantes de donación
     */
    @Test
    public void testGenerarComprobante() {
        // Realizamos una donación
        donacion = donante.realizarDonacion(100.0);
        
        // Generamos un comprobante
        String comprobante = donacion.generarComprobante();
        
        // Verificamos el contenido del comprobante
        assertNotNull("El comprobante no debería ser nulo", comprobante);
        assertTrue("El comprobante debería incluir el texto 'Comprobante de donación'", 
                 comprobante.contains("Comprobante de donación"));
        assertTrue("El comprobante debería incluir el nombre del donante", 
                 comprobante.contains(donante.getNombre()));
        assertTrue("El comprobante debería incluir el monto de la donación", 
                 comprobante.contains("Monto: $100.0"));
        assertTrue("El comprobante debería incluir un ID de transacción", 
                 comprobante.contains("ID de transacción:"));
    }
}
