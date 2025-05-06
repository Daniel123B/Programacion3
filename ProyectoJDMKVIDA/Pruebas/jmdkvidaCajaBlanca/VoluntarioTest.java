package ProyectoJDMKVIDA.Pruebas.jmdkvidaCajaBlanca;

import org.junit.Before;
import org.junit.Test;

import ProyectoJDMKVIDA.jmdkvida.*;

import static org.junit.Assert.*;

public class VoluntarioTest {
    private Voluntario voluntario;
    private Actividad actividad;

    @Before
    public void setUp() {
        String[] habilidades = {"Enseñanza", "Programación", "Cocina"};
        voluntario = new Voluntario("V001", "Voluntario Test", "voluntario@test.com", "vol123", habilidades, "Fines de semana");
        actividad = new Actividad(voluntario, "ACT001", "Clase de Lectura", "Enseñar a leer a niños");
    }

    @Test
    public void testRegistrarActividad() {
        assertEquals(0, voluntario.getActividades().size());
        voluntario.registrarActividad(actividad);
        assertEquals(1, voluntario.getActividades().size());
        assertEquals(actividad, voluntario.getActividades().get(0));
    }

    @Test
    public void testGetHabilidades() {
        String[] habilidades = voluntario.getHabilidades();
        assertNotNull(habilidades);
        assertEquals(3, habilidades.length);
        assertEquals("Enseñanza", habilidades[0]);
        assertEquals("Programación", habilidades[1]);
        assertEquals("Cocina", habilidades[2]);
    }
}

