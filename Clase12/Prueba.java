package Clase12;

import java.util.ArrayList;

public class Prueba {
    public static void main(String[] args) {
        // Factores de emisión por vehículo al año (en toneladas de CO₂)
        double fGasolina = 4.6;
        double fDiesel = 5.1;
        double fGas = 3.0;

        ArrayList<Categoria> categorias = new ArrayList<>();

        // Categoría: Camiones
        Categoria camiones = new Categoria("Camiones");
        camiones.agregarSubcategoria(new Subcategoria("Livianos", 400_000, 0.30, 0.40, 0.30));
        camiones.agregarSubcategoria(new Subcategoria("Medianos", 280_000, 0.25, 0.50, 0.25));
        camiones.agregarSubcategoria(new Subcategoria("Pesados", 380_000, 0.10, 0.80, 0.10));
        categorias.add(camiones);

        // Categoría: Tractocamiones
        Categoria tractos = new Categoria("Tractocamiones");
        tractos.agregarSubcategoria(new Subcategoria("Única", 1_150_000, 0.05, 0.90, 0.05));
        categorias.add(tractos);

        // Categoría: Volquetas
        Categoria volquetas = new Categoria("Volquetas");
        volquetas.agregarSubcategoria(new Subcategoria("Única", 936_000, 0.40, 0.40, 0.20));
        categorias.add(volquetas);

        // Mostrar emisiones por categoría y subcategoría
        for (Categoria c : categorias) {
            c.mostrarEmisiones(fGasolina, fDiesel, fGas);
            System.out.println("--------------------------------------------------");
        }
    }
}
