package ProyectoJDMKVIDA.jmdkvida;
import java.util.Date;

public class Donacion {
    private Usuario usuario;
    private double monto;
    private Date fecha;
    
    // Constructor
    public Donacion(Usuario usuario, double monto) {
        this.usuario = usuario;
        this.monto = monto;
        this.fecha = new Date();
    }
    
    // Getters y setters
    public Usuario getUsuario() {
        return usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public double getMonto() {
        return monto;
    }
    
    public void setMonto(double monto) {
        this.monto = monto;
    }
    
    public Date getFecha() {
        return fecha;
    }
    
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    // Método para generar comprobante
    public String generarComprobante() {
        String comprobante = "Comprobante de donación\n";
        comprobante += "Fecha: " + fecha + "\n";
        comprobante += "Donante: " + usuario.getNombre() + "\n";
        comprobante += "Monto: $" + monto + "\n";
        comprobante += "ID de transacción: " + System.currentTimeMillis();
        
        System.out.println("Comprobante generado para donación de " + usuario.getNombre());
        return comprobante;
    }
}

