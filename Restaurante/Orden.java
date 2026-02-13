import java.util.ArrayList;

public class Orden {

    public int hora;
    public String mesero;
    public Pago pago; // Composición
    public ArrayList<Bebida> bebidas; // Agregación
    public ArrayList<Platillo> platillos; // Agregación

    public Orden(int hora, String mesero) {
        this.hora = hora;
        this.mesero = mesero;
        this.bebidas = new ArrayList<>();
        this.platillos = new ArrayList<>();
    }

    // Composición con Pago
    public void setPago(Pago pago) {
        this.pago = pago;
    }

    // Agregación
    public void agregarBebida(Bebida bebida) {
        bebidas.add(bebida);
    }

    public void agregarPlatillo(Platillo platillo) {
        platillos.add(platillo);
    }

    public double calcularTotal() {
        return pago.calculoTotal();
    }
}
