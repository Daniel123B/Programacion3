package jmdkvida;
import java.util.ArrayList;
import java.util.List;

public class Beneficiario extends Usuario {
    private int edad;
    private String contacto;
    private String situacionEconomica;
    private List<Curso> cursos;
    private List<Encuesta> encuestas;
    
    // Constructor
    public Beneficiario(String id, String nombre, String email, String password, int edad, String contacto, String situacionEconomica) {
        super(id, nombre, email, password);
        this.edad = edad;
        this.contacto = contacto;
        this.situacionEconomica = situacionEconomica;
        this.cursos = new ArrayList<>();
        this.encuestas = new ArrayList<>();
    }
    
    // Getters y setters
    public int getEdad() {
        return edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String getContacto() {
        return contacto;
    }
    
    public void setContacto(String contacto) {
        this.contacto = contacto;
    }
    
    public String getSituacionEconomica() {
        return situacionEconomica;
    }
    
    public void setSituacionEconomica(String situacionEconomica) {
        this.situacionEconomica = situacionEconomica;
    }
    
    public List<Curso> getCursos() {
        return cursos;
    }
    
    public List<Encuesta> getEncuestas() {
        return encuestas;
    }
    
    // Método para inscribirse en curso
    public boolean inscribirEnCurso(Curso curso) {
        if (!cursos.contains(curso)) {
            cursos.add(curso);
            System.out.println("Beneficiario " + nombre + " inscrito en curso: " + curso.getTitulo());
            return true;
        }
        System.out.println("El beneficiario ya está inscrito en este curso");
        return false;
    }
    
    // Método para responder encuesta
    public void responderEncuesta(Encuesta encuesta, String[] respuestas) {
        encuesta.setRespuestas(respuestas);
        encuestas.add(encuesta);
        System.out.println("Beneficiario " + nombre + " ha respondido la encuesta: " + encuesta.getPreguntas()[0]);
    }
}
