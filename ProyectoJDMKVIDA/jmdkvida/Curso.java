package ProyectoJDMKVIDA.jmdkvida;
import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String id;
    private String titulo;
    private String descripcion;
    private String contenidoEducativo;
    private List<Evaluacion> evaluaciones;
    
    // Constructor
    public Curso(String id, String titulo, String descripcion, String contenidoEducativo) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.contenidoEducativo = contenidoEducativo;
        this.evaluaciones = new ArrayList<>();
    }
    
    // Getters y setters
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public String getContenidoEducativo() {
        return contenidoEducativo;
    }
    
    public void setContenidoEducativo(String contenidoEducativo) {
        this.contenidoEducativo = contenidoEducativo;
    }
    
    public List<Evaluacion> getEvaluaciones() {
        return evaluaciones;
    }
    
    // Método para agregar evaluación
    public void agregarEvaluacion(Evaluacion evaluacion) {
        evaluaciones.add(evaluacion);
        System.out.println("Evaluación agregada al curso " + titulo);
    }
}