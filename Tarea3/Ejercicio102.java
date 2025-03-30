package Tarea3;

public class Ejercicio102 {
    public static void main(String[] args) {
        String[] elementosIniciales = {"A", "B", "C"};
        ColaCircular2 cola = new ColaCircular2(5, 0, 3, elementosIniciales);
        cola.imprimirCola();
        cola.encolar("D");
        cola.encolar("E");
        cola.encolar("F"); // Intentará agregar un elemento cuando la cola esté llena
        cola.desencolar();
        cola.desencolar();
        cola.encolar("G");
        cola.imprimirCola();
    }
}

