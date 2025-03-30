package Tarea3;
import java.util.Arrays;

// creo la clase ColaCircular para manejar mi estructura de datos
class ColaCircular {
    private int capacidad; // Defino la capacidad máxima de la cola
    private String[] cola; // Aquí guardo los elementos de la cola
    private int frente; //  Apunta al primer elemento de la cola
    private int fin;    //  Indica dónde agregaré el próximo elemento

    public ColaCircular(int capacidad, int frente, int fin, String[] elementos) {
        this.capacidad = capacidad;
        this.cola = new String[capacidad]; // Inicializo el array con la capacidad máxima
        this.frente = frente;
        this.fin = fin;

        // Ahora inserto los elementos iniciales en la cola
        for (int i = 0; i < elementos.length; i++) {
            this.cola[frente + i] = elementos[i];
        }
    }

    // Método para encolar un nuevo elemento
    public void encolar(String elemento) {
        // verifico si la cola está llena
        if ((fin + 1) % capacidad == frente) {
            System.out.println("La cola está llena. No puedo agregar " + elemento);
            return;
        }
        // Agrego el elemento en la posición actual de 'fin'
        cola[fin] = elemento;
        // Muevo fin a la siguiente posición circularmente
        fin = (fin + 1) % capacidad;
        imprimirCola();
    }

    // Método para eliminar metodo desencolar un elemento de la cola
    public void desencolar() {
        // verifico si la cola está vacía
        if (frente == fin) {
            System.out.println("La cola está vacía.");
            return;
        }
        // Muestro cuál es el elemento que estoy eliminando
        System.out.println("Elemento eliminado: " + cola[frente]);
        // Lo elimino estableciendo su valor como null
        cola[frente] = null;
        // Muevo frente a la siguiente posición circularmente
        frente = (frente + 1) % capacidad;
        imprimirCola();
    }

    // Metodo para vaciar completamente la cola
    public void vaciarCola() {
        // Mientras haya elementos en la cola, los elimino uno por uno
        while (frente != fin) {
            desencolar();
        }
    }

    // Metodo para imprimir el estado actual de la cola
    public void imprimirCola() {
        System.out.println("Cola actual: " + Arrays.toString(cola)); // Muestro el array
        System.out.println("Frente: " + frente + ", Fin: " + fin); // Muestro los punteros
        System.out.println("------------------------------------");
    }
}