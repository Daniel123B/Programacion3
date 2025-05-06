package jmdkvidaCajaBlanca;

import jmdkvida.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Date;

public class FundacionTest {
    private Fundacion fundacion;
    private Fundador fundador;
    private Documento documento;

    @Before
    public void setUp() {
        fundador = new Fundador("F001", "Fundador Test", "fundador@test.com", "fund123");
        fundacion = new Fundacion("FUN001", fundador, "Fundación Test");
        documento = new Documento(1, "Legal", "url/doc1.pdf");
    }

    @Test
    public void testAgregarDocumento() {
        assertEquals(0, fundacion.getDocumentos().size());
        fundacion.agregarDocumento(documento);
        assertEquals(1, fundacion.getDocumentos().size());
        assertEquals(documento, fundacion.getDocumentos().get(0));
    }

    @Test
    public void testCrearEvento() {
        String idEvento = "E001";
        Date fechaEvento = new Date();
        String ubicacion = "Centro Comunitario";
        Evento evento = fundacion.crearEvento(idEvento, fechaEvento, ubicacion);
        assertNotNull(evento);
        assertEquals(idEvento, evento.getId());
        assertEquals(fechaEvento, evento.getFecha());
        assertEquals(ubicacion, evento.getUbicacion());
    }
}

