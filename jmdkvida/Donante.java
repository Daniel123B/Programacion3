package jmdkvida;
public class Donante extends Usuario {
    private List<Donacion> donaciones;
    private String metodoPago;
    
    // Constructor
    public Donante(String id, String nombre, String email, String password, String metodoPago) {
        super(id, nombre, email, password);
        this.metodoPago = metodoPago;
        this.donaciones = new ArrayList<>();
    }
    
    // Getters y setters
    public List<Donacion> getDonaciones() {
        return donaciones;
    }
    
    public String getMetodoPago() {
        return metodoPago;
    }
    
    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }
    
    // Método para realizar donación
    public Donacion realizarDonacion(double monto) {
        Donacion donacion = new Donacion(this, monto);
        donaciones.add(donacion);
        System.out.println("Donación realizada por " + nombre + " por un monto de " + monto);
        return donacion;
    }
}
