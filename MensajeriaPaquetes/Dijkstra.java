package MensajeriaPaquetes;

import java.util.*;

public class Dijkstra {
    private static final int INFINITY = Integer.MAX_VALUE;

    public static void dijkstra(int[][] grafo, int nodoInicio, int nodoDestino) {
        int numVertices = grafo.length;
        boolean[] visitado = new boolean[numVertices];
        int[] distancia = new int[numVertices];
        int[] predecesor = new int[numVertices];

        Arrays.fill(distancia, INFINITY);
        Arrays.fill(predecesor, -1);
        distancia[nodoInicio] = 0;

        for (int i = 0; i < numVertices - 1; i++) {
            int u = encontrarMinimo(distancia, visitado);
            if (u == -1) break; // No hay más nodos alcanzables
            visitado[u] = true;

            for (int v = 0; v < numVertices; v++) {
                if (!visitado[v] && grafo[u][v] != 0 &&
                    distancia[u] != INFINITY &&
                    distancia[u] + grafo[u][v] < distancia[v]) {
                    distancia[v] = distancia[u] + grafo[u][v];
                    predecesor[v] = u;
                }
            }
        }

        imprimirRutaEspecifica(distancia, predecesor, nodoInicio, nodoDestino);
    }

    private static int encontrarMinimo(int[] distancia, boolean[] visitado) {
        int min = INFINITY, minIndex = -1;
        for (int i = 0; i < distancia.length; i++) {
            if (!visitado[i] && distancia[i] <= min) {
                min = distancia[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    private static void imprimirRutaEspecifica(int[] distancia, int[] predecesor, int nodoInicio, int nodoDestino) {
        System.out.println("\nResultados desde el nodo " + (char)('A' + nodoInicio) + ":");
        if (distancia[nodoDestino] == INFINITY) {
            System.out.println("No hay ruta disponible hacia el nodo " + (char)('A' + nodoDestino));
            return;
        }
        System.out.print("Destino " + (char)('A' + nodoDestino) + " → Distancia: " + distancia[nodoDestino]);
        System.out.print(" | Ruta: ");
        imprimirRuta(nodoDestino, predecesor);
        System.out.println();
    }

    private static void imprimirRuta(int nodo, int[] predecesor) {
        List<Character> ruta = new ArrayList<>();
        for (int actual = nodo; actual != -1; actual = predecesor[actual]) {
            ruta.add((char)('A' + actual));
        }
        Collections.reverse(ruta);
        for (int i = 0; i < ruta.size(); i++) {
            System.out.print(ruta.get(i));
            if (i < ruta.size() - 1) System.out.print(" → ");
        }
    }
}
