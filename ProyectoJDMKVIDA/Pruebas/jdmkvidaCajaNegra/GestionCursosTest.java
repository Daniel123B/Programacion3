package ProyectoJDMKVIDA.Pruebas.jdmkvidaCajaNegra;
import org.junit.Before;
import org.junit.Test;

import ProyectoJDMKVIDA.jmdkvida.Beneficiario;
import ProyectoJDMKVIDA.jmdkvida.Curso;
import ProyectoJDMKVIDA.jmdkvida.Evaluacion;

import static org.junit.Assert.*;

public class GestionCursosTest {
    
    private Beneficiario beneficiario;
    private Curso curso;
    private Evaluacion evaluacion;
    
    @Before
    public void setUp() {
        beneficiario = new Beneficiario("B001", "Carlos López", "familia@gmail.com", "ben789", 
                                       9, "555-1234", "Familia numerosa con recursos limitados");
        
        curso = new Curso("C001", "Alfabetización Básica", 
                         "Curso de lectura y escritura para principiantes", 
                         "Material educativo para aprender a leer y escribir");
        
        String[] preguntas = {"¿Qué letra es esta: A?", "¿Qué palabra se forma con las letras C-A-S-A?"};
        evaluacion = new Evaluacion(preguntas);
    }
    
    /**
     * Prueba de caja negra para verificar la inscripción de beneficiarios en cursos
     */
    @Test
    public void testInscripcionCurso() {
        // Estado inicial
        assertEquals(0, beneficiario.getCursos().size());
        
        // Inscribimos al beneficiario en el curso
        boolean resultado = beneficiario.inscribirEnCurso(curso);
        
        // Verificamos la inscripción
        assertTrue("La inscripción debería ser exitosa", resultado);
        assertEquals(1, beneficiario.getCursos().size());
        assertTrue(beneficiario.getCursos().contains(curso));
        
        // Intentamos inscribir al beneficiario nuevamente en el mismo curso
        boolean resultadoDuplicado = beneficiario.inscribirEnCurso(curso);
        
        // Verificamos que no se permita la inscripción duplicada
        assertFalse("No debería permitir inscripción duplicada", resultadoDuplicado);
        assertEquals(1, beneficiario.getCursos().size());
    }
    
    /**
     * Prueba de caja negra para verificar la agregación de evaluaciones a un curso
     */
    @Test
    public void testAgregarEvaluacion() {
        // Estado inicial
        assertEquals(0, curso.getEvaluaciones().size());
        
        // Agregamos una evaluación al curso
        curso.agregarEvaluacion(evaluacion);
        
        // Verificamos que se haya agregado correctamente
        assertEquals(1, curso.getEvaluaciones().size());
        assertTrue(curso.getEvaluaciones().contains(evaluacion));
    }
    
    /**
     * Prueba de caja negra para verificar el proceso de calificación de evaluaciones
     */
    @Test
    public void testCalificacionEvaluacion() {
        // Estado inicial
        assertEquals(0, evaluacion.getCalificacion());
        
        // Preparamos las respuestas del estudiante y las respuestas correctas
        String[] respuestasEstudiante = {"A", "CASA"};
        String[] respuestasCorrectas = {"A", "CASA"};
        
        // Calificamos la evaluación
        evaluacion.calificar(respuestasEstudiante, respuestasCorrectas);
        
        // Verificamos la calificación (debería ser 100 porque todas son correctas)
        assertEquals(100, evaluacion.getCalificacion());
        
        // Ahora con algunas respuestas incorrectas
        String[] respuestasIncorrectas = {"B", "CASA"};
        evaluacion.calificar(respuestasIncorrectas, respuestasCorrectas);
        
        // Verificamos la nueva calificación (debería ser 50 porque solo una es correcta)
        assertEquals(50, evaluacion.getCalificacion());
    }
}