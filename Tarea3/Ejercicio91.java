package Tarea3;
import java.util.Stack;
public class Ejercicio91 {
    public static void main(String[] args) {
        //El codigo del taller estaba con los metodos en español, asi que debi pasarlos en ingles para que funcionaran correctamente
        Stack<Integer> p = new Stack<>();
        int x = 4, y;

        p.push(x);  // Insertar 4
        System.out.println("\n " + p.peek());  // Mostrar cima de la pila

        y = p.pop();  // Sacar el 4
        p.push(32);   // Insertar 32
        p.push(p.pop()); // Sacar 32 y volverlo a insertar

        // Extraer elementos hasta vaciar la pila con do-while
        do {
            System.out.println("\n " + p.pop());
        } while (!p.isEmpty());

        //Al final el programa imprime los numeros:4 y 32
    }
}
    