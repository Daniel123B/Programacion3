package Tarea3;
import java.util.Stack;
public class Ejercicio94 {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5,6,7,8,9,10}; // Cree un arreglo con los diez numeros
        Stack<Integer> pila = new Stack<>();
        for (Integer num : numeros) {
            pila.push(num); // Agregue cada numero a la pila
        }

        System.out.println("La pila original es: ");
        for(Integer num : numeros){
            System.out.print(num + " ");  // Imprime la pila original
        }

        System.out.println("\nElementos de la pila extraidos: "); // Imprime los elementos extraidos de la pila (orden inverso)
        while (!pila.isEmpty()) { // Mientras la pila no esté vacía
            System.out.print(pila.pop() + " "); // Extrae cada elemento de la pila y lo imprime
        }

    }
}
