package jmdkvidaCajaBlanca;

import jmdkvida.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;

public class AdministradorTest {
    private Administrador admin;
    private Fundacion fundacion;
    private Fundador fundador;

    @Before
    public void setUp() {
        admin = new Administrador("A001", "Admin Test", "admin@jmdkvida.com", "admin123");
        fundador = new Fundador("F001", "Fundador Test", "fundador@test.com", "fund123");
        fundacion = new Fundacion("FUN001", fundador, "Fundación Test");
    }

    @Test
    public void testVerificarFundacion() {
        assertEquals(EstadoVerificacion.PENDIENTE, fundacion.getEstadoVerificacion());
        boolean resultado = admin.verificarFundacion(fundacion);
        assertTrue(resultado);
        assertEquals(EstadoVerificacion.VERIFICADO, fundacion.getEstadoVerificacion());
    }

    @Test
    public void testGenerarReportes() {
        List<String> reportes = admin.generarReportes();
        assertNotNull(reportes);
        assertEquals(3, reportes.size());
        assertTrue(reportes.contains("Reporte de Beneficiarios"));
        assertTrue(reportes.contains("Reporte de Donaciones"));
        assertTrue(reportes.contains("Reporte de Actividades"));
    }

    @Test
    public void testGestionarPermisos() {
        boolean resultado1 = admin.gestionarPermisos(fundador, "CREAR_EVENTO", true);
        assertTrue(resultado1);
        boolean resultado2 = admin.gestionarPermisos(fundador, "CREAR_EVENTO", false);
        assertTrue(resultado2);
    }
}
