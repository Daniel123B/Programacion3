package jmdkvidaCajaBlanca;

import jmdkvida.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class BeneficiarioTest {
    
    private Beneficiario beneficiario;
    private Curso curso;
    private Encuesta encuesta;
    
    @Before
    public void setUp() {
        beneficiario = new Beneficiario("B001", "Beneficiario Test", "beneficiario@test.com", "ben123", 12, "555-1234", "Recursos limitados");
        curso = new Curso("C001", "Alfabetización Básica", "Curso de lectura y escritura", "Contenido del curso");
        String[] preguntas = {"¿Cómo calificarías el curso?", "¿El material fue útil?"};
        encuesta = new Encuesta(preguntas);
    }
    
    /**
     * Prueba de caja blanca para el método inscribirEnCurso
     * 
     * Examina la estructura interna del método inscribirEnCurso, verificando
     * que el curso se agregue correctamente a la lista y que no se duplique.
     */
    @Test
    public void testInscribirEnCurso() {
        // Verificamos el tamaño inicial de la lista
        assertEquals(0, beneficiario.getCursos().size());
        
        // Ejecutamos el método a probar - primera inscripción
        boolean resultado1 = beneficiario.inscribirEnCurso(curso);
        
        // Verificamos que se haya agregado correctamente
        assertTrue(resultado1);
        assertEquals(1, beneficiario.getCursos().size());
        assertEquals(curso, beneficiario.getCursos().get(0));
        
        // Intentamos inscribir al mismo curso nuevamente
        boolean resultado2 = beneficiario.inscribirEnCurso(curso);
        
        // Verificamos que no se haya agregado duplicado
        assertFalse(resultado2);
        assertEquals(1, beneficiario.getCursos().size());
    }
    
    /**
     * Prueba de caja blanca para el método responderEncuesta
     * 
     * Examina la estructura interna del método responderEncuesta, verificando
     * que las respuestas se guarden correctamente.
     */
    @Test
    public void testResponderEncuesta() {
        // Preparamos las respuestas
        String[] respuestas = {"Excelente", "Muy útil"};
        
        // Verificamos el tamaño inicial de la lista
        assertEquals(0, beneficiario.getEncuestas().size());
        
        // Ejecutamos el método a probar
        beneficiario.responderEncuesta(encuesta, respuestas);
        
        // Verificamos que se haya agregado correctamente
        assertEquals(1, beneficiario.getEncuestas().size());
        assertEquals(encuesta, beneficiario.getEncuestas().get(0));
        
        // Verificamos que las respuestas se hayan guardado
        assertArrayEquals(respuestas, encuesta.getRespuestas());
    }
}
