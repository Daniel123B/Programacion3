package jmdkvida;
public class Fundador extends Usuario {
    private Fundacion fundacion;
    
    // Constructor
    public Fundador(String id, String nombre, String email, String password) {
        super(id, nombre, email, password);
    }
    
    // Getters y setters
    public Fundacion getFundacion() {
        return fundacion;
    }
    
    public void setFundacion(Fundacion fundacion) {
        this.fundacion = fundacion;
    }
    
    // Método para subir documentos legales
    public boolean subirDocumentosLegales(Documento documento) {
        if (fundacion != null) {
            fundacion.agregarDocumento(documento);
            return true;
        }
        System.out.println("Error: Fundación no asignada");
        return false;
    }
    
    // Método para gestionar la fundación
    public void gestionarFundacion(Fundacion fundacion) {
        this.fundacion = fundacion;
        System.out.println("Gestionando fundación: " + fundacion.getNombre());
    }
}
