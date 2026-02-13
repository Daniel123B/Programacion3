public class Cliente {

    private int mesa;
    private int comensales;
    private Orden orden; // Composición

    public Cliente(int mesa, int comensales, int hora, String mesero) {
        this.mesa = mesa;
        this.comensales = comensales;
        this.orden = new Orden(hora, mesero); // Se crea dentro → composición
    }

    public Orden getOrden() {
        return orden;
    }
}
