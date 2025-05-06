package jdmkvidaCajaNegra;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Date;

import jmdkvida.Fundador;
import jmdkvida.Fundacion;
import jmdkvida.Voluntario;
import jmdkvida.Evento;

public class GestionEventosTest {
    
    private Fundacion fundacion;
    private Fundador fundador;
    private Evento evento;
    private Voluntario voluntario1;
    private Voluntario voluntario2;
    
    @Before
    public void setUp() {
        fundador = new Fundador("F001", "Juan Pérez", "juan@fundacion.org", "pass123");
        fundacion = new Fundacion("FUN001", fundador, "Fundación Esperanza");
        fundador.setFundacion(fundacion);
        
        Date fechaEvento = new Date(); // Fecha actual para el evento
        evento = fundacion.crearEvento("E001", fechaEvento, "Plaza Central");
        
        String[] habilidades1 = {"Enseñanza", "Diseño gráfico"};
        voluntario1 = new Voluntario("V001", "Ana García", "ana@voluntario.org", "vol456", habilidades1, "Fines de semana");
        
        String[] habilidades2 = {"Cocina", "Primeros auxilios"};
        voluntario2 = new Voluntario("V002", "Pedro Martínez", "pedro@voluntario.org", "vol789", habilidades2, "Tardes");
    }
    
    /**
     * Prueba de caja negra para verificar la creación de eventos
     */
    @Test
    public void testCreacionEvento() {
        // Verificamos que el evento se haya creado correctamente
        assertEquals("E001", evento.getId());
        assertEquals("Plaza Central", evento.getUbicacion());
        assertNotNull("La fecha del evento no debería ser nula", evento.getFecha());
    }
    
    /**
     * Prueba de caja negra para verificar el registro de asistentes a un evento
     */
    @Test
    public void testRegistroAsistentes() {
        // Verificamos el estado inicial
        assertEquals(0, evento.getAsistentes().size());
        
        // Registramos al primer voluntario
        evento.registrarAsistencia(voluntario1);
        
        // Verificamos que se haya registrado
        assertEquals(1, evento.getAsistentes().size());
        assertTrue(evento.getAsistentes().contains(voluntario1));
        
        // Registramos al segundo voluntario
        evento.registrarAsistencia(voluntario2);
        
        // Verificamos que se haya registrado
        assertEquals(2, evento.getAsistentes().size());
        assertTrue(evento.getAsistentes().contains(voluntario2));
        
        // Intentamos registrar nuevamente al primer voluntario
        evento.registrarAsistencia(voluntario1);
        
        // Verificamos que no se haya duplicado
        assertEquals(2, evento.getAsistentes().size());
    }
}
