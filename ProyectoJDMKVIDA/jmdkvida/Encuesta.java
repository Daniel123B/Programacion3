package ProyectoJDMKVIDA.jmdkvida;
public class Encuesta {
    private String[] preguntas;
    private String[] respuestas;
    
    // Constructor
    public Encuesta(String[] preguntas) {
        this.preguntas = preguntas;
        this.respuestas = new String[preguntas.length];
    }
    
    // Getters y setters
    public String[] getPreguntas() {
        return preguntas;
    }
    
    public void setPreguntas(String[] preguntas) {
        this.preguntas = preguntas;
    }
    
    public String[] getRespuestas() {
        return respuestas;
    }
    
    public void setRespuestas(String[] respuestas) {
        this.respuestas = respuestas;
    }
    
    // Método para analizar resultados
    public String analizarResultados() {
        StringBuilder analisis = new StringBuilder("Análisis de resultados de la encuesta:\n");
        
        for (int i = 0; i < preguntas.length; i++) {
            analisis.append("Pregunta ").append(i + 1).append(": ").append(preguntas[i]).append("\n");
            if (respuestas[i] != null) {
                analisis.append("Respuesta: ").append(respuestas[i]).append("\n\n");
            } else {
                analisis.append("Sin respuesta\n\n");
            }
        }
        
        System.out.println("Análisis de encuesta completado");
        return analisis.toString();
    }
}