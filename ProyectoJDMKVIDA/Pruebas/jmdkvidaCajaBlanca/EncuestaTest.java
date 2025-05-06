package ProyectoJDMKVIDA.Pruebas.jmdkvidaCajaBlanca;

import org.junit.Before;
import org.junit.Test;

import ProyectoJDMKVIDA.jmdkvida.*;

import static org.junit.Assert.*;

public class EncuestaTest {
    
    private Encuesta encuesta;
    private String[] preguntas;
    private String[] respuestas;
    
    @Before
    public void setUp() {
        preguntas = new String[]{"¿Pregunta 1?", "¿Pregunta 2?", "¿Pregunta 3?"};
        respuestas = new String[]{"Respuesta 1", "Respuesta 2", "Respuesta 3"};
        encuesta = new Encuesta(preguntas);
    }
    
    /**
     * Prueba de caja blanca para el método analizarResultados
     * 
     * Examina la estructura interna del método analizarResultados, verificando
     * que genere el análisis correcto con las preguntas y respuestas.
     */
    @Test
    public void testAnalizarResultados() {
        // Establecemos las respuestas
        encuesta.setRespuestas(respuestas);
        
        // Ejecutamos el método a probar
        String analisis = encuesta.analizarResultados();
        
        // Verificamos que el análisis no sea nulo
        assertNotNull(analisis);
        
        // Verificamos que el análisis contenga la información esperada
        for (int i = 0; i < preguntas.length; i++) {
            assertTrue(analisis.contains("Pregunta " + (i+1) + ": " + preguntas[i]));
            assertTrue(analisis.contains("Respuesta: " + respuestas[i]));
        }
    }
    
    /**
     * Prueba de caja blanca para el método analizarResultados con respuestas nulas
     * 
     * Examina el comportamiento del método cuando algunas respuestas son nulas.
     */
    @Test
    public void testAnalizarResultadosConRespuestasNulas() {
        // Respuestas con un valor nulo
        String[] respuestasIncompletas = new String[]{"Respuesta 1", null, "Respuesta 3"};
        encuesta.setRespuestas(respuestasIncompletas);
        
        // Ejecutamos el método a probar
        String analisis = encuesta.analizarResultados();
        
        // Verificamos que el análisis no sea nulo
        assertNotNull(analisis);
        
        // Verificamos que maneje correctamente las respuestas nulas
        assertTrue(analisis.contains("Respuesta: Respuesta 1"));
        assertTrue(analisis.contains("Sin respuesta"));
        assertTrue(analisis.contains("Respuesta: Respuesta 3"));
    }
}

