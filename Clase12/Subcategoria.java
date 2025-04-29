package Clase12;

public class Subcategoria {
    String nombre;
    int cantidadVehiculos;
    double porcentajeGasolina;
    double porcentajeDiesel;
    double porcentajeGas;

    public Subcategoria(String nombre, int cantidadVehiculos,
            double porcentajeGasolina, double porcentajeDiesel, double porcentajeGas) {
        this.nombre = nombre;
        this.cantidadVehiculos = cantidadVehiculos;
        this.porcentajeGasolina = porcentajeGasolina;
        this.porcentajeDiesel = porcentajeDiesel;
        this.porcentajeGas = porcentajeGas;
    }

    // Este método calcula las emisiones de CO₂ de esta subcategoría
    public void calcularEmisiones(double fGasolina, double fDiesel, double fGas) {
        // Primero calculo cuántos vehículos usan cada tipo de combustible
        int gasolina = (int) (cantidadVehiculos * porcentajeGasolina);
        int diesel = (int) (cantidadVehiculos * porcentajeDiesel);
        int gas = (int) (cantidadVehiculos * porcentajeGas);

        // Después multiplico cada cantidad por su respectivo factor de emisión
        double emisionGasolina = gasolina * fGasolina;
        double emisionDiesel = diesel * fDiesel;
        double emisionGas = gas * fGas;

        // Sumo todas las emisiones para obtener el total de esta subcategoría
        double total = emisionGasolina + emisionDiesel + emisionGas;

        // Finalmente, muestro los resultados organizados por tipo de combustible y el total
        System.out.println("  Subcategoría: " + nombre);
        System.out.printf("    Gasolina: %,d veh -> %.2f ton CO₂\n", gasolina, emisionGasolina);
        System.out.printf("    Diesel:   %,d veh -> %.2f ton CO₂\n", diesel, emisionDiesel);
        System.out.printf("    Gas:      %,d veh -> %.2f ton CO₂\n", gas, emisionGas);
        System.out.printf("    Total emisiones: %.2f toneladas CO₂\n\n", total);
    }
}
