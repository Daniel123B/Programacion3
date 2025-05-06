package ProyectoJDMKVIDA.jmdkvida;

import java.util.ArrayList;
import java.util.List;

public class Voluntario extends Usuario {
    private String[] habilidades;
    private String disponibilidad;
    private List<Actividad> actividades;
    
    // Constructor
    public Voluntario(String id, String nombre, String email, String password, String[] habilidades, String disponibilidad) {
        super(id, nombre, email, password);
        this.habilidades = habilidades;
        this.disponibilidad = disponibilidad;
        this.actividades = new ArrayList<>();
    }
    
    // Getters y setters
    public String[] getHabilidades() {
        return habilidades;
    }
    
    public void setHabilidades(String[] habilidades) {
        this.habilidades = habilidades;
    }
    
    public String getDisponibilidad() {
        return disponibilidad;
    }
    
    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    
    public List<Actividad> getActividades() {
        return actividades;
    }
    
    // Método para registrar actividad
    public void registrarActividad(Actividad actividad) {
        actividades.add(actividad);
        System.out.println("Actividad registrada para voluntario " + nombre + ": " + actividad.getDescripcion());
    }
}
