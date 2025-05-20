package MensajeriaPaquetes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Escáner para leer datos del usuario

        System.out.print("Ingrese el número de nodos: ");
        int n = sc.nextInt(); 
        
        int[][] grafo = new int[n][n]; // Creamos la matriz de adyacencia

        // Solicitamos al usuario que ingrese la matriz de adyacencia
        System.out.println("Ingrese la matriz de adyacencia:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grafo[i][j] = sc.nextInt(); // Leemos los pesos entre nodos
            }
        }

        // Pedimos el nodo de inicio
        System.out.print("Ingrese el nodo de inicio (como número, 0 para A, 1 para B, etc.): ");
        int inicio = sc.nextInt();

        // Pedimos el nodo destino
        System.out.print("Ingrese el nodo destino (como número, 0 para A, 1 para B, etc.): ");
        int destino = sc.nextInt();

        // Llamamos al algoritmo de Dijkstra para calcular el camino más corto
        Dijkstra.dijkstra(grafo, inicio, destino);

        sc.close(); 
    }
}
