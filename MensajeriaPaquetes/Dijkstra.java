package MensajeriaPaquetes;

import java.util.*;

public class Dijkstra {
    // Constante que representa el valor infinito (cuando no hay conexión entre nodos)
    private static final int INFINITY = Integer.MAX_VALUE;

    // Método principal que implementa el algoritmo de Dijkstra
    public static void dijkstra(int[][] grafo, int nodoInicio, int nodoDestino) {
        int numVertices = grafo.length; // Número de nodos en el grafo

        boolean[] visitado = new boolean[numVertices]; // Marca los nodos que ya se han procesado
        int[] distancia = new int[numVertices];        // Guarda la distancia mínima desde el nodo inicial
        int[] predecesor = new int[numVertices];       // Guarda el nodo anterior en el camino más corto

        // Inicializamos las distancias al valor infinito y predecesores como -1 (ninguno)
        Arrays.fill(distancia, INFINITY);
        Arrays.fill(predecesor, -1);
        distancia[nodoInicio] = 0; // La distancia al nodo de inicio es 0

        // Repetimos el proceso para todos los nodos (menos uno)
        for (int i = 0; i < numVertices - 1; i++) {
            int u = encontrarMinimo(distancia, visitado); // Encontramos el nodo más cercano no visitado
            if (u == -1) break; // Si no se encuentra nodo, se termina

            visitado[u] = true; // Marcamos el nodo como visitado

            // Recorremos todos los nodos vecinos
            for (int v = 0; v < numVertices; v++) {
                // Solo actualizamos si no ha sido visitado, hay conexión, y la nueva distancia es mejor
                if (!visitado[v] && grafo[u][v] != 0 &&
                    distancia[u] != INFINITY &&
                    distancia[u] + grafo[u][v] < distancia[v]) {
                    
                    distancia[v] = distancia[u] + grafo[u][v]; // Actualizamos distancia mínima
                    predecesor[v] = u; // Guardamos el nodo anterior para reconstruir la ruta
                }
            }
        }

        // Imprimimos el resultado final del recorrido
        imprimirRutaEspecifica(distancia, predecesor, nodoInicio, nodoDestino);
    }

    // Método auxiliar para encontrar el nodo no visitado con menor distancia
    private static int encontrarMinimo(int[] distancia, boolean[] visitado) {
        int min = INFINITY, minIndex = -1;

        for (int i = 0; i < distancia.length; i++) {
            if (!visitado[i] && distancia[i] <= min) {
                min = distancia[i];
                minIndex = i;
            }
        }

        return minIndex; // Retornamos el índice del nodo con menor distancia no visitado
    }

    // Imprime la distancia total y la ruta desde el nodoInicio al nodoDestino
    private static void imprimirRutaEspecifica(int[] distancia, int[] predecesor, int nodoInicio, int nodoDestino) {
        System.out.println("\nResultados desde el nodo " + (char)('A' + nodoInicio) + ":");

        if (distancia[nodoDestino] == INFINITY) {
            // Si la distancia es infinita, no hay camino
            System.out.println("No hay ruta disponible hacia el nodo " + (char)('A' + nodoDestino));
            return;
        }

        // Se muestra distancia y ruta
        System.out.print("Destino " + (char)('A' + nodoDestino) + " → Distancia: " + distancia[nodoDestino]);
        System.out.print(" | Ruta: ");
        imprimirRuta(nodoDestino, predecesor); // Se imprime la secuencia de nodos del camino
        System.out.println();
    }

    // Imprime la ruta desde el nodo de inicio al nodo destino
    private static void imprimirRuta(int nodo, int[] predecesor) {
        List<Character> ruta = new ArrayList<>();

        // Vamos retrocediendo desde el nodo destino al inicio usando el arreglo de predecesores
        for (int actual = nodo; actual != -1; actual = predecesor[actual]) {
            ruta.add((char)('A' + actual)); // Convertimos el índice en letra (A, B, C...)
        }

        // Revertimos la ruta para que quede en orden desde el inicio
        Collections.reverse(ruta);

        // Imprimimos la ruta con flechas
        for (int i = 0; i < ruta.size(); i++) {
            System.out.print(ruta.get(i));
            if (i < ruta.size() - 1) System.out.print(" → ");
        }
    }
}
