package Clase2;

public class VectorEntero {
    private int[] v;
    private int n;

    public VectorEntero() {
        n = 0;
        v = null;
    }

    public VectorEntero(int nx) {
        if (nx > 0) {
            n = nx;
            v = new int[n];
        } else {
            n = 0;
            v = null;
        }
    }

    public void set(int nx) {
        if (nx > 0) {
            n = nx;
            v = new int[n];
        } else {
            n = 0;
            v = null;
        }
    }

    private int aleatorio(int min, int max) {
        return (int) (Math.random() * (max - min + 1) + min);
    }

    public void llenadoAutomatico(int min, int max) {
        for (int i = 0; i < n; i++)
            v[i] = aleatorio(min, max);
    }

    public int sumaElementos() {
        int suma = 0;

        for (int i = 0; i < n; i++) {
            suma += v[i];
        }

        return suma;
    }

    public void imprimirVertical() {
        System.out.println("\nIMPRESION VERTICAL");
        for(int i=0; i < n; i++)
            System.out.println("v[" + i + "]= " + v[i]);
    }        

}