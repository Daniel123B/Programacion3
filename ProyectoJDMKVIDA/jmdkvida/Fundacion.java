package ProyectoJDMKVIDA.jmdkvida;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

public class Fundacion {
    private String id;
    private Usuario usuario;
    private String nombre;
    private EstadoVerificacion estadoVerificacion;
    private List<Documento> documentos;
    
    // Constructor
    public Fundacion(String id, Usuario usuario, String nombre) {
        this.id = id;
        this.usuario = usuario;
        this.nombre = nombre;
        this.estadoVerificacion = EstadoVerificacion.PENDIENTE;
        this.documentos = new ArrayList<>();
    }
    
    // Getters y setters
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public Usuario getUsuario() {
        return usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public EstadoVerificacion getEstadoVerificacion() {
        return estadoVerificacion;
    }
    
    public void setEstadoVerificacion(EstadoVerificacion estadoVerificacion) {
        this.estadoVerificacion = estadoVerificacion;
    }
    
    public List<Documento> getDocumentos() {
        return documentos;
    }
    
    public void agregarDocumento(Documento documento) {
        this.documentos.add(documento);
        System.out.println("Documento agregado a la fundación: " + documento.getTipo());
    }
    
    // Método para crear un evento
    public Evento crearEvento(String id, Date fecha, String ubicacion) {
        Evento evento = new Evento(id, fecha, ubicacion);
        System.out.println("Evento creado: " + evento.getId() + " en " + evento.getUbicacion());
        return evento;
    }
}