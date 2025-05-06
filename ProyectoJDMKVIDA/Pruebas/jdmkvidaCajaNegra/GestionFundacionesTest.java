package ProyectoJDMKVIDA.Pruebas.jdmkvidaCajaNegra;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import ProyectoJDMKVIDA.jmdkvida.Administrador;
import ProyectoJDMKVIDA.jmdkvida.Documento;
import ProyectoJDMKVIDA.jmdkvida.EstadoVerificacion;
import ProyectoJDMKVIDA.jmdkvida.Fundacion;
import ProyectoJDMKVIDA.jmdkvida.Fundador;

public class GestionFundacionesTest {

    private Fundador fundador;
    private Fundacion fundacion;
    private Administrador admin;
    private Documento docLegal;
    private Documento docFinanciero;

    @Before
    public void setUp() {
        fundador = new Fundador("F001", "Juan Pérez", "juan@fundacion.org", "pass123");
        fundacion = new Fundacion("FUN001", fundador, "Fundación Esperanza");
        fundador.setFundacion(fundacion);

        admin = new Administrador("A001", "Admin Sistema", "admin@jmdkvida.com", "admin123");

        docLegal = new Documento(1, "Registro Legal", "docs/registro_legal.pdf");
        docFinanciero = new Documento(2, "Estados Financieros", "docs/estados_financieros.pdf");
    }

    @Test
    public void testRegistroFundacion() {
        assertEquals("FUN001", fundacion.getId());
        assertEquals("Fundación Esperanza", fundacion.getNombre());
        assertEquals(fundador, fundacion.getUsuario());
        assertEquals(EstadoVerificacion.PENDIENTE, fundacion.getEstadoVerificacion());
    }

    @Test
    public void testSubidaDocumentos() {
        assertEquals(0, fundacion.getDocumentos().size());

        boolean resultadoLegal = fundador.subirDocumentosLegales(docLegal);
        assertTrue("Debería poder subir documentos legales", resultadoLegal);
        assertEquals(1, fundacion.getDocumentos().size());

        boolean resultadoFinanciero = fundador.subirDocumentosLegales(docFinanciero);
        assertTrue("Debería poder subir documentos financieros", resultadoFinanciero);
        assertEquals(2, fundacion.getDocumentos().size());
    }

    @Test
    public void testVerificacionFundacion() {
        assertEquals(EstadoVerificacion.PENDIENTE, fundacion.getEstadoVerificacion());

        fundador.subirDocumentosLegales(docLegal);
        fundador.subirDocumentosLegales(docFinanciero);

        boolean resultado = admin.verificarFundacion(fundacion);

        assertTrue("El proceso de verificación debería ser exitoso", resultado);
        assertEquals(EstadoVerificacion.VERIFICADO, fundacion.getEstadoVerificacion());
    }
}

