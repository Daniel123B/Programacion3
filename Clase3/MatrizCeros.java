import java.util.Random;

public class MatrizCeros {

    private int[][] v;
    private int n;
    private int x;

    public MatrizCeros() {
        n = 10;
        x = 10;
        v = new int[n][x];
        llenadoAutomatico(n, x);
    }

    public void llenadoAutomatico(int minimo, int maximo) {
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < x; j++) {
                v[i][j] = rand.nextInt(maximo - minimo + 1) + minimo;
            }
        }
    }

    public void cerosdiagonal(){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < x; j++) {
                if (j >= i) {
                    v[i][j] = 0;
                }
            }
        }
    }

    public void imprimirMatriz() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < x; j++) {
                System.out.println("m[" + i + "][" + j + "]=" + v[i][j]);
            }
        }
    }

    public void mostrarMatriz() {
        System.out.println("\nLa matriz es: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(v[i][j] + " ");
            }
            System.out.println("");
        }
    }

}


