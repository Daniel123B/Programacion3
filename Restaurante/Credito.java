public class Credito extends Pago {

    public int numeroTarjeta;
    public String tipo;
    public String fechaExp;
    public String nombre;

    public Credito(double subTotal, double propina, double impuestos,
                   int numeroTarjeta, String tipo, String fechaExp, String nombre) {

        super(subTotal, propina, impuestos);
        this.numeroTarjeta = numeroTarjeta;
        this.tipo = tipo;
        this.fechaExp = fechaExp;
        this.nombre = nombre;
    }

    public boolean hacerCargo() {
        double total = calculoTotal();
        System.out.println("Cargo realizado por: " + total);
        return true;
    }
}