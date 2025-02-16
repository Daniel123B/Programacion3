package Clase2;

import java.util.Scanner;
import java.util.Arrays;

public class EjerciciosTaller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /*
          Ejercico #1 Hallar la suma de los N numeros del vector
          
          VectorEntero vector1 = new VectorEntero();
          System.out.print("Digite el tamaño del vector ");
          int n = sc.nextInt();
          vector1.set(n);
          vector1.llenadoAutomatico(-2 * n, 2 * n);
          vector1.imprimirVertical();
          
          System.out.print("La suma de los elementos del vector es:  " +
          vector1.sumaElementos());
         */

        /*
          Ejercicio #2
          
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
         */

        /*
          //Ejercicio #3
          
          VectorEntero vectorsuma = new VectorEntero();
          System.out.print("Digite el tamaño del vector ");
          int n = sc.nextInt();
          vectorsuma.set(n);
          vectorsuma.llenadoAutomatico(-2 * n, 2 * n);
          vectorsuma.imprimirVertical();
          
          System.out.println("La suma de los elementos pares del vector es:  " +
          vectorsuma.sumaPar());
          System.out.println("La suma de los elementos impares del vector es:  " +
          vectorsuma.sumaImpar());
         */

        /*
          // Ejercicio 4
          VectorEntero vectorEdad1 = new VectorEntero();
          VectorEntero vectorEdad2 = new VectorEntero();
          System.out.print("Digite el número de personas que tendra cada lista: ");
          int n = sc.nextInt();
          vectorEdad1.set(n);
          vectorEdad1.llenadoAutomatico(1, 5 * n);
          vectorEdad1.imprimirVertical();
          
          vectorEdad2.set(n);
          vectorEdad2.llenadoAutomatico(1, 5 * n);
          vectorEdad2.imprimirVertical();
          
          System.out.println("La edad mayor entre ambas listas es de:  " +
          vectorEdad1.edadMayor(vectorEdad2));
         */
        
        //Ejercicio 5

         VectorDoble vector5 = new VectorDoble();
          System.out.print("Digite el numero de productos: ");
          int n = sc.nextInt();
          vector5.set(n);
          sc.nextLine();

          for (int i = 0; i < n; i++){
            System.out.println("Ingrese la descripcion del producto "+(i + 1) +": ");
            vector5.s[i] = sc.nextLine();

            System.out.println("Ingrese el precio unitario del producto "+(i + 1) + ": ");
            vector5.d[i] = sc.nextDouble();

            System.out.println("Ingrese la cantidad comprada del producto "+(i + 1) + ": ");
            vector5.d2[i] = sc.nextDouble();
            sc.nextLine();
          }

          vector5.calcularTotalGastado();

          System.out.println("\nTotal gastado por producto: ");
          vector5.imprimirTotalGastado();

          double totalGeneral = vector5.calcularTotalGeneral();
          System.out.println("\nEl total general de todas las compras es: "+totalGeneral);

          System.out.println("\nProducto con mayor gasto: "+vector5.productoMayorGasto());
        

        /*
          // Ejercicio 7
          
          VectorEntero vector7 = new VectorEntero();
          System.out.print("A continuacion los 10 numeros del vector: ");
          vector7.set(10);
          vector7.llenadoAutomatico(-2 * 10, 2 * 10);
          vector7.imprimirHorizontal();
          
          int[] pares = vector7.obtenerPares();
          System.out.println("\nNúmeros pares:");
          System.out.print("[");
          for (int num : pares) {
          System.out.print(num + " ");
          }
          System.out.print("]");
          
          int[] impares = vector7.obtenerImpares();
          System.out.println("\nNúmeros impares:");
          System.out.print("[");
          for (int num : impares) {
          System.out.print(num + " ");
          }
          System.out.print("]");
          
         */

        /*
          // Ejercico 8
          
          VectorEntero vector8 = new VectorEntero();
          System.out.print("A continuacion los 30 numeros del vector: ");
          vector8.set(30);
          vector8.llenadoAutomatico(-2 * 10, 2 * 10);
          vector8.imprimirHorizontal();
          int numayor = vector8.nMayor();
          
          System.out.println("El numero mayor del vector es: " + numayor +
          " y se repeti " + vector8.elementoRepetidoMayor(numayor) + " veces");
         */
        
         /* //ejercicio 9
         VectorEntero vector9 = new VectorEntero();
          System.out.print("Digite el tamaño del vector: ");
          int n = sc.nextInt();
          vector9.set(n);
          vector9.llenadoAutomatico(-2 * 10, 2 * 10);
          vector9.imprimirHorizontal();

          System.out.print("Digite el valor que desea buscar en el vector: ");
          int valorABuscar1 = sc.nextInt();
          vector9.imprimirValorRepetido(valorABuscar1);
         */

        /*  //Ejercicio 10

          VectorEntero vector10 = new VectorEntero();
          System.out.print("Digite el tamaño del vector ");
          int n = sc.nextInt();
          vector10.set(n);
          vector10.llenadoAutomatico(-2 * n, 2 * n);
          System.out.println("El vector original es: ");
          vector10.imprimirHorizontal();

          VectorEntero resultado = vector10.sumaExtremos();
          System.out.println("Vector nuevo con la suma de sus extremos: ");
          resultado.imprimirHorizontal();
        */
        
        /* //Ejercicio 11
          VectorEntero vector11 = new VectorEntero();
          System.out.print("Digite el tamaño del vector ");
          int n = sc.nextInt();
          vector11.set(n);
          vector11.llenadoAutomatico(-2 * n, 2 * n);
          vector11.imprimirHorizontal();

          int[] conteos = vector11.contarElementos();
          int[][] resultado = vector11.dividirVector();

          System.out.println("El vector con los elementos positivos: "+ Arrays.toString(resultado[0]));
          System.out.println("El vector con los elementos negativos: "+ Arrays.toString(resultado[1]));
          System.out.println("El vector con los elementos ceros: "+ Arrays.toString(resultado[2]));
        */

        
        /* 
        // Ejercicio 12

        VectorEntero vector12 = new VectorEntero();
        System.out.print("Digite el tamaño del vector ");
        int n = sc.nextInt();
        vector12.set(n);
        vector12.llenadoAutomatico(-2 * n, 2 * n);
        vector12.imprimirHorizontal();

        System.out.println("Ingrese el valor a buscar: ");
        int x = sc.nextInt();

        VectorEntero posicionesVector = vector12.buscarPosicionesVector(x);

        if (posicionesVector.getN() > 0) {
          System.out.println("El número "+ x + " aparece en las posiciones: ");
          posicionesVector.imprimirHorizontal();
        } else {
          System.out.println("El numero "+ x + " no aparece en las posiciones: ");
        }
        
        */
        
        /* 
        //Ejercicio 13

        VectorEntero vector13 = new VectorEntero();
        System.out.print("Digite el tamaño del vector ");
        int n = sc.nextInt();
        vector13.set(n);
        vector13.llenadoAutomatico(-2 * n, 2 * n);
        vector13.imprimirHorizontal();

        double media = vector13.calcularMedia();
        System.out.println("La media es: "+ media);

        VectorEntero mayores = vector13.MayoresMedia();
        System.out.println("Los elementos mayores que la media: ");
        mayores.imprimirHorizontal();

        VectorEntero menores = vector13.MenoresMedia();
        System.out.println("Los elementos menores que la media: ");
        menores.imprimirHorizontal();
        */
      
        
        /* // Ejercico 14

        VectorEntero vector14 = new VectorEntero();
        System.out.print("Digite el tamaño del vector ");
        int n = sc.nextInt();
        vector14.set(n);
        vector14.llenadoAutomatico(-2 * n, 2 * n);
        vector14.imprimirHorizontal();
        
        VectorEntero menorArreglo = vector14.arregloMenor();
        System.out.println("El arreglo resultante es: ");
        menorArreglo.imprimirHorizontal();

        */
       
        /* //Ejercicio 15

        VectorDoble vector15 = new VectorDoble();
        System.out.print("Digite el numero de trabajadores: ");
        int n = sc.nextInt();
        vector15.set(n);
        vector15.llenadoAutomaticoTrabajadores(99.9*n, 100*n);
        vector15.imprimirDatosTrabajadores();

        double promedio = vector15.calcularPromedio();
        System.out.println("\nEl sueldo promedio es: " +  promedio);

        int cantidadPromedio = vector15.contarSueldoPromedio();
        System.out.println("Cantidad de trabajadores con sueldo promedio: " + cantidadPromedio);

        VectorDoble trabajadoresPromedio = vector15.obtenerTrabajadoresPromedio();
        if (trabajadoresPromedio.getN() > 0) {
            System.out.println("\nTrabajadores con sueldo promedio:");
            trabajadoresPromedio.imprimirDatosTrabajadores();
        } else {
            System.out.println("\nNingún trabajador tiene el sueldo promedio exacto.");
        }
      
       */
       
       /* 
       // Ejercicio 16
       System.out.print("Digite el numero de profesores: ");
        int n = sc.nextInt();
        sc.nextLine();
        
        String[] nombres = new String[n];
        int[] edades = new int[n];
        String[] sexo = new String[n];

        for (int i = 0; i < n; i++){
          System.out.println("Ingrese el nombre del profesor: "+(i + 1)+ ": ");
          nombres[i] = sc.nextLine();

          System.out.print("Ingrese la edad del profesor " + (i + 1) + ": ");
          edades[i] = sc.nextInt();
          sc.nextLine();

          System.out.print("Ingrese el sexo del profesor " + (i + 1) + "(Masculino/Femenino): ");
          sexo[i] = sc.nextLine();
        }

        double suma = 0;
        for (int i = 0; i < n; i++){
          suma += edades[i];
        }
        double promedio = (n > 0) ? suma / n : 0;
        System.out.println("\nLa edad promedio del grupo de profesores es: "+promedio);

        int mayorEdad = 0;
        int menorEdad = 0;

        for (int i = 0; i < n; i++){
          if (edades[i] > edades[mayorEdad]) {
              mayorEdad = i;  
          }
          if (edades[i] < edades[menorEdad]) {
              menorEdad = i;
          }
        }

        System.out.println("Profesor más joven: "+nombres[menorEdad]);
        System.out.println("Profesor más viejo: "+nombres[mayorEdad]);

        int contadorF = 0;
        int contadorM = 0;

        for (int i = 0; i < n; i++){
          if (sexo[i].equalsIgnoreCase("Femenino") && edades[i] > promedio) {
            contadorF++;
          }
          if (sexo[i].equalsIgnoreCase("Masculino") && edades[i] > promedio) {
            contadorM++;
          }
        }

        System.out.println("Número de profesoras con edad mayor al promedio: " + contadorF);
        System.out.println("Número de profesores con edad menor al promedio: " + contadorM);
      
        */
    



    

    
      


    }
}