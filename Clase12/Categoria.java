package Clase12;

import java.util.ArrayList;

// Esta clase representa una categoría general de vehículos, como "Camiones" o "Volquetas"
class Categoria {
    String nombre;
    ArrayList<Subcategoria> subcategorias;

    public Categoria(String nombre) {
        this.nombre = nombre;
        this.subcategorias = new ArrayList<>();
    }

    // Este método me permite agregar una subcategoría (como "Camiones Livianos") a esta categoría
    public void agregarSubcategoria(Subcategoria sub) {
        subcategorias.add(sub); // la agrego a la lista
    }

    // Este método me sirve para mostrar las emisiones de CO₂ de todas las subcategorías
    public void mostrarEmisiones(double fGasolina, double fDiesel, double fGas) {
        // Primero muestro el nombre de la categoría
        System.out.println("Categoría: " + nombre);

        // Después, recorro todas las subcategorías y para cada una llamo su método para calcular emisiones
        for (Subcategoria sub : subcategorias) {
            sub.calcularEmisiones(fGasolina, fDiesel, fGas);
        }
    }
}

