package MensajeriaPaquetes;

import java.util.*;

public class Dijkstra {
    private static final int INFINITY = Integer.MAX_VALUE;

    public static void dijkstra(int[][] grafo, int nodoInicio) {
        int numVertices = grafo.length;
        boolean[] visitado = new boolean[numVertices];
        int[] distancia = new int[numVertices];
        int[] predecesor = new int[numVertices];

        Arrays.fill(distancia, INFINITY);
        Arrays.fill(predecesor, -1);
        distancia[nodoInicio] = 0;

        for (int i = 0; i < numVertices - 1; i++) {
            int u = encontrarMinimo(distancia, visitado);
            visitado[u] = true;

            for (int v = 0; v < numVertices; v++) {
                if (!visitado[v] && grafo[u][v] != 0 &&
                    distancia[u] + grafo[u][v] < distancia[v]) {
                    distancia[v] = distancia[u] + grafo[u][v];
                    predecesor[v] = u;
                }
            }
        }

        imprimirResultados(distancia, predecesor, nodoInicio);
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

    private static void imprimirResultados(int[] distancia, int[] predecesor, int nodoInicio) {
        System.out.println("\nResultados desde el nodo " + nodoInicio + ":");
        for (int i = 0; i < distancia.length; i++) {
            System.out.print("Nodo " + nodoInicio + " a " + i + " -> Distancia: " + distancia[i]);
            System.out.print(" | Ruta: ");
            imprimirRuta(i, predecesor);
            System.out.println();
        }
    }

    private static void imprimirRuta(int nodo, int[] predecesor) {
        if (predecesor[nodo] != -1) {
            imprimirRuta(predecesor[nodo], predecesor);
        }
        System.out.print(nodo + " ");
    }
}
