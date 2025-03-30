package Tarea3;
import java.util.Stack;
public class Ejercicio92 {

    public static void main(String[] args) {
        Stack<String> libros = new Stack<>();  // Creo una pila de tipo String y agrego los elementos
        libros.push("Principito");
        libros.push("Odisea");
        libros.push("Dracula");

        Stack<String> auxiliar = new Stack<>(); // Creo una pila auxiliar y copio los elementos de libros
        auxiliar.addAll(libros); // se copia sin modificar la pila original

        System.out.println("El contenido de la pila de libros es: ");
        mostrarPila(auxiliar); // Muestro el contenido de la pila auxiliar

    }

    public static void mostrarPila(Stack<String> pila){
        // Muestro los elementos desapilándolos
        while (!pila.isEmpty()) {  // Mientras la pila no esté vacía
            System.out.println(pila.pop()); // Muestro el contenido de la pila y la elimino
        }
    }

    
}
