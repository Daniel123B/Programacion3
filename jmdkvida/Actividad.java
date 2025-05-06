package jmdkvida;
import java.util.Date;

public class Actividad {
    private Usuario usuario;
    private String id;
    private String nombre;
    private String descripcion;
    private Date fecha;
    
    // Constructor
    public Actividad(Usuario usuario, String id, String nombre, String descripcion) {
        this.usuario = usuario;
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha = new Date();
    }
    
    // Getters y setters
    public Usuario getUsuario() {
        return usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public Date getFecha() {
        return fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
}
