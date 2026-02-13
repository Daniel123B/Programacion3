public class Prueba {

    public static void main(String[] args) {

        Cliente cliente = new Cliente(5, 3, 14, "Carlos");

        Orden orden = cliente.getOrden();

        // Agregación
        orden.agregarBebida(new Bebida(2, "Gaseosa"));
        orden.agregarPlatillo(new Platillo(1, "Hamburguesa"));

        // Pago con tarjeta
        Credito pagoCredito = new Credito(
                50000,
                5000,
                3000,
                12345678,
                "Visa",
                "12/27",
                "Daniel Perez"
        );

        orden.setPago(pagoCredito);

        System.out.println("Total a pagar: " + orden.calcularTotal());

        pagoCredito.hacerCargo();
    }
}