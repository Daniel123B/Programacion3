package Clase2;

import java.util.Scanner;

public class Ejercicio1Talller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*  Ejercico #1 Hallar la suma de los N numeros del vector

        VectorEntero vector1 = new VectorEntero();
        System.out.print("Digite el tamaño del vector ");
        int n = sc.nextInt();
        vector1.set(n);
        vector1.llenadoAutomatico(-2 * n, 2 * n);
        vector1.imprimirVertical();

        System.out.print("La suma de los elementos del vector es:  " + vector1.sumaElementos());
        */

        // Ejercicio #2

        VectorEntero vectorSueldo = new VectorEntero();
        VectorEntero vectorAsignaciones = new VectorEntero();
        VectorEntero vectorDeducciones = new VectorEntero();
        VectorEntero vectorNeto = new VectorEntero();

        System.out.print("Digite el número de empleados ");
        int n = sc.nextInt();
        vectorSueldo.set(n);
        vectorSueldo.llenadoAutomatico(200 * n, 500 * n);
        vectorAsignaciones.set(n);
        vectorAsignaciones.llenadoAutomatico(200 * n, 500 * n);
        vectorDeducciones.set(n);
        vectorDeducciones.llenadoAutomatico(200 * n, 500 * n);
        vectorNeto.set(n);
        

        for (int i = 0; i < n; i++) {
            int sueldo = vectorSueldo.getVector(i);
            int asignaciones = vectorAsignaciones.getVector(i);
            int deducciones = vectorDeducciones.getVector(i);
            int neto = sueldo + asignaciones - deducciones;

            System.out.println("Empleado " + (i + 1) + ":");
            System.out.println("  Sueldo: " + sueldo);
            System.out.println("  Asignaciones: " + asignaciones);
            System.out.println("  Deducciones: " + deducciones);
            System.out.println("  Neto a pagar: " + neto);
        }
    


        






    }
}