package ProyectoJDMKVIDA.jmdkvida;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Evento {
    private String id;
    private Date fecha;
    private String ubicacion;
    private List<Voluntario> asistentes;
    
    // Constructor
    public Evento(String id, Date fecha, String ubicacion) {
        this.id = id;
        this.fecha = fecha;
        this.ubicacion = ubicacion;
        this.asistentes = new ArrayList<>();
    }
    
    // Getters y setters
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public Date getFecha() {
        return fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    public String getUbicacion() {
        return ubicacion;
    }
    
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    public List<Voluntario> getAsistentes() {
        return asistentes;
    }
    
    // Método para registrar asistencia
    public void registrarAsistencia(Voluntario voluntario) {
        if (!asistentes.contains(voluntario)) {
            asistentes.add(voluntario);
            System.out.println("Voluntario " + voluntario.getNombre() + " registrado en evento " + id);
        } else {
            System.out.println("El voluntario ya está registrado en este evento");
        }
    }
}
