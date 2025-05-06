package jmdkvidaCajaBlanca;

import jmdkvida.*;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class EvaluacionTest {
    
    private Evaluacion evaluacion;
    private String[] preguntas;
    private String[] respuestas;
    private String[] respuestasCorrectas;
    
    @Before
    public void setUp() {
        preguntas = new String[]{"¿2+2?", "¿Capital de Francia?", "¿Color del cielo?"};
        respuestas = new String[]{"4", "París", "Azul"};
        respuestasCorrectas = new String[]{"4", "París", "Azul"};
        evaluacion = new Evaluacion(preguntas);
    }
    
    /**
     * Prueba de caja blanca para el método calificar con todas las respuestas correctas
     * 
     * Examina la estructura interna del método calificar, verificando que calcule
     * correctamente la calificación cuando todas las respuestas son correctas.
     */
    @Test
    public void testCalificarTodasCorrectas() {
        // Ejecutamos el método a probar
        evaluacion.calificar(respuestas, respuestasCorrectas);
        
        // Verificamos que la calificación sea 100
        assertEquals(100, evaluacion.getCalificacion());
    }
    
    /**
     * Prueba de caja blanca para el método calificar con algunas respuestas incorrectas
     * 
     * Examina la estructura interna del método calificar, verificando que calcule
     * correctamente la calificación cuando algunas respuestas son incorrectas.
     */
    @Test
    public void testCalificarAlgunasIncorrectas() {
        // Respuestas con un error
        String[] respuestasConError = new String[]{"4", "Madrid", "Azul"};
        
        // Ejecutamos el método a probar
        evaluacion.calificar(respuestasConError, respuestasCorrectas);
        
        // Verificamos que la calificación sea aproximadamente 66.67 (2/3 * 100)
        assertEquals(66, evaluacion.getCalificacion());
    }
    
    /**
     * Prueba de caja blanca para el método calificar con todas las respuestas incorrectas
     * 
     * Examina la estructura interna del método calificar, verificando que calcule
     * correctamente la calificación cuando todas las respuestas son incorrectas.
     */
    @Test
    public void testCalificarTodasIncorrectas() {
        // Respuestas todas incorrectas
        String[] respuestasIncorrectas = new String[]{"5", "Madrid", "Verde"};
        
        // Ejecutamos el método a probar
        evaluacion.calificar(respuestasIncorrectas, respuestasCorrectas);
        
        // Verificamos que la calificación sea 0
        assertEquals(0, evaluacion.getCalificacion());
    }
}
