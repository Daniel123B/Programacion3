package jmdkvida;
public class Evaluacion {
    private String[] preguntas;
    private int calificacion;
    
    // Constructor
    public Evaluacion(String[] preguntas) {
        this.preguntas = preguntas;
        this.calificacion = 0;
    }
    
    // Getters y setters
    public String[] getPreguntas() {
        return preguntas;
    }
    
    public void setPreguntas(String[] preguntas) {
        this.preguntas = preguntas;
    }
    
    public int getCalificacion() {
        return calificacion;
    }
    
    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
        System.out.println("Calificación establecida: " + calificacion);
    }
    
    // Método para calificar la evaluación
    public void calificar(String[] respuestas, String[] respuestasCorrectas) {
        int correctas = 0;
        for (int i = 0; i < respuestas.length; i++) {
            if (respuestas[i].equals(respuestasCorrectas[i])) {
                correctas++;
            }
        }
        
        this.calificacion = (correctas * 100) / respuestas.length;
        System.out.println("Evaluación calificada con " + calificacion + " puntos");
    }
}
