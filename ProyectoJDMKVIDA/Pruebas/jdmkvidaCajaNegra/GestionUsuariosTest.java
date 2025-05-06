package ProyectoJDMKVIDA.Pruebas.jdmkvidaCajaNegra;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import ProyectoJDMKVIDA.jmdkvida.Administrador;
import ProyectoJDMKVIDA.jmdkvida.Beneficiario;
import ProyectoJDMKVIDA.jmdkvida.Donante;
import ProyectoJDMKVIDA.jmdkvida.Fundador;
import ProyectoJDMKVIDA.jmdkvida.Voluntario;

public class GestionUsuariosTest {
    
    private Fundador fundador;
    private Voluntario voluntario;
    private Beneficiario beneficiario;
    private Donante donante;
    private Administrador admin;
    
    @Before
    public void setUp() {
        fundador = new Fundador("F001", "Juan Pérez", "juan@fundacion.org", "pass123");
        
        String[] habilidades = {"Enseñanza", "Diseño gráfico", "Programación"};
        voluntario = new Voluntario("V001", "Ana García", "ana@voluntario.org", "vol456", habilidades, "Fines de semana");
        
        beneficiario = new Beneficiario("B001", "Carlos López", "familia@gmail.com", "ben789", 9, "555-1234", "Familia numerosa con recursos limitados");
        
        donante = new Donante("D001", "María Rodríguez", "maria@empresa.com", "don101", "Transferencia bancaria");
        
        admin = new Administrador("A001", "Admin Sistema", "admin@jmdkvida.com", "admin123");
    }
    
    @Test
    public void testLogin() {
        assertTrue("El fundador debería poder iniciar sesión", fundador.login());
        assertTrue("El voluntario debería poder iniciar sesión", voluntario.login());
        assertTrue("El beneficiario debería poder iniciar sesión", beneficiario.login());
        assertTrue("El donante debería poder iniciar sesión", donante.login());
        assertTrue("El administrador debería poder iniciar sesión", admin.login());
    }
    
    @Test
    public void testDatosUsuarios() {
        assertEquals("F001", fundador.getId());
        assertEquals("Juan Pérez", fundador.getNombre());
        assertEquals("juan@fundacion.org", fundador.getEmail());

        assertEquals("V001", voluntario.getId());
        assertEquals("Ana García", voluntario.getNombre());
        assertEquals("Fines de semana", voluntario.getDisponibilidad());
        assertEquals(3, voluntario.getHabilidades().length);

        assertEquals("B001", beneficiario.getId());
        assertEquals("Carlos López", beneficiario.getNombre());
        assertEquals(9, beneficiario.getEdad());
        assertEquals("Familia numerosa con recursos limitados", beneficiario.getSituacionEconomica());

        assertEquals("D001", donante.getId());
        assertEquals("María Rodríguez", donante.getNombre());
        assertEquals("Transferencia bancaria", donante.getMetodoPago());
    }
}

