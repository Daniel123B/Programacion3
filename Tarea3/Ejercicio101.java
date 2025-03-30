package Tarea3;

public class Ejercicio101 {
    public static void main(String[] args) {

        String[] elementosIniciales = { "Mar", "Sella", "Centurión" };

        // Ahora creo mi cola circular con una capacidad de 6
        ColaCircular cola = new ColaCircular(6, 2, 5, elementosIniciales);

        // Muestro el estado inicial de la cola
        System.out.println("Estado inicial de la cola:");
        cola.imprimirCola();

        //  Agrego "Gloria" y "Generosa"
        cola.encolar("Gloria");
        cola.encolar("Generosa");

        cola.desencolar(); // Elimino un elemento de la cola

        cola.encolar("Positivo");  //  Agrego "Positivo" a la cola

        cola.encolar("Horche"); // Agrego "Horche" a la cola

        cola.vaciarCola(); // elimino todos los elementos de la cola
    }
}
