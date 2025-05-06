package ProyectoJDMKVIDA.jmdkvida;
import java.util.Date;

public class Documento {
    private int id;
    private String tipo;
    private String url;
    private Date fechaSubida;
    
    // Constructor
    public Documento(int id, String tipo, String url) {
        this.id = id;
        this.tipo = tipo;
        this.url = url;
        this.fechaSubida = new Date();
    }
    
    // Getters y setters
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public String getUrl() {
        return url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }
    
    public Date getFechaSubida() {
        return fechaSubida;
    }
    
    public void setFechaSubida(Date fechaSubida) {
        this.fechaSubida = fechaSubida;
    }
}

