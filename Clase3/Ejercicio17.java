
import java.util.Scanner;

public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MatrizEntera matriz1 = new MatrizEntera();
        System.out.print("Digite el numero de filas de la matriz: ");
        int n = sc.nextInt();
        System.out.print("Digite el numero de columnas de la matriz: ");
        int x = sc.nextInt();
        matriz1.set(n,x);
        matriz1.llenadoAutomatico(-2 * n, 2 * x);
        matriz1.imprimirMatriz();
        matriz1.mostrarMatriz();
        matriz1.sumaColumnas();
        matriz1.sumaFilas();

        

    }
}
