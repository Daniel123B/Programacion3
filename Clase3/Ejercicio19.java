import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MatrizEntera matriz19 = new MatrizEntera();
        System.out.print("Digite el numero de filas de la matriz: ");
        int n = sc.nextInt();
        System.out.print("Digite el numero de columnas de la matriz: ");
        int x = sc.nextInt();
        matriz19.set(n,x);
        matriz19.llenadounosDiagonal();
        matriz19.imprimirMatriz();
        matriz19.mostrarMatriz();
    }
}
