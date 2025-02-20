import java.util.Random;

public class MatrizEntera {

    private int[][] v;
    private int n;
    private int x;

    public MatrizEntera() {
        n = 0;
        x = 0;
        v = null;
    }

    public MatrizEntera(int nx, int xx) {
        if (nx > 0) {
            n = nx;
            x = xx;
            v = new int[n][x];
        } else {
            n = 0;
            x = 0;
            v = null;
        }
    }

    public void set(int nx, int xx) {
        if (nx > 0 && xx > 0) {
            n = nx;
            x = xx;
            v = new int[n][x];
        } else {
            n = 0;
            x = 0;
            v = null;
        }
    }

    public int sumaFilas() {
        int sumaf = 0;
        for (int i = 0; i < n; i++) {
            sumaf = 0;
            for (int j = 0; j < x; j++) {
                sumaf += v[i][j];
            }
            System.out.println("La suma de la fila " + i + " es: " + sumaf);
        }
        return sumaf;
    }

    public int sumaColumnas() {
        int sumac = 0;
        for (int j = 0; j < x; j++) {
            sumac = 0;
            for (int i = 0; i < n; i++) {
                sumac += v[i][j];
            }
            System.out.println("La suma de la columna " + j + " es: " + sumac);
        }
        return sumac;
    }

    public void llenadoAutomatico(int minimo, int maximo) {
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < x; j++) {
                v[i][j] = rand.nextInt(maximo - minimo + 1) + minimo;
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