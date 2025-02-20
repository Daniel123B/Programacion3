import java.util.Random;

public class MatrizTabla {

    private int[][] v;
    private int n;
    private int x;

    public MatrizTabla() {
        n = 10;
        x = 10;
        v = new int[n][x];
    }

    public void llenarTabla(){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < x; j++) {
           v[i][j] = (i+1)*(j+1);
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

    public void mostrarMatrizTabla() {
        System.out.println("\nLa Tabla de multiplicar del 1 al 10 es: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(String.format("%3d ",v[i][j]));
            }
            System.out.println("");
        }
    }


}