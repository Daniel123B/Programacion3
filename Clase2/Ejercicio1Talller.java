package Clase2;

import java.util.Scanner;

public class Ejercicio1Talller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ejercico #1 Hallar la suma de los N numeros del vector

        VectorEntero vector1 = new VectorEntero();
        System.out.print("Digite el tamaño del vector ");
        int n = sc.nextInt();
        vector1.set(n);
        vector1.llenadoAutomatico(-2 * n, 2 * n);
        vector1.imprimirVertical();

        System.out.print("La suma de los elementos del vector es:  " + vector1.sumaElementos());

    }
}