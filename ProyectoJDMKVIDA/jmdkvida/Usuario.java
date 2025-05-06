package ProyectoJDMKVIDA.jmdkvida;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Clase Usuario (superclase)
public abstract class Usuario {
    protected String id;
    protected String nombre;
    protected String email;
    protected String password;
    protected Date fechaRegistro;
    
    // Constructor
    public Usuario(String id, String nombre, String email, String password) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.password = password;
        this.fechaRegistro = new Date();
    }
    
    // Getters y setters
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
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getPassword() {
        return password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }
    
    public Date getFechaRegistro() {
        return fechaRegistro;
    }
    
    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    
    // Métodos de inicio y cierre de sesión
    public boolean login() {
        // Lógica para verificar credenciales
        System.out.println("Usuario " + email + " ha iniciado sesión");
        return true;
    }
    
    public void logout() {
        System.out.println("Usuario " + email + " ha cerrado sesión");
    }
}


