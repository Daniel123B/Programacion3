import java.util.Scanner;

public class Ejecutar {
    public static void main(String[] args) {
        boolean salir = false;
        Scanner scanner = new Scanner(System.in);

 
        
        while (!salir) {
            // Imprimir el menú en la consola
            System.out.println("Bienvenido al programa del cine");
            System.out.println("Por favor seleccione una opción:");
            System.out.println("1. Ver funciones");
            System.out.println("2. Ver horarios");
            System.out.println("3. Comprar boleta");
            System.out.println("4. Salir");
            System.out.print("Ingrese su opción: ");
            
            // Leer la opción ingresada por el usuario
            String opcion = scanner.nextLine();
            
            // Verificar la opción seleccionada
            switch (opcion) {
                case "1":
                    System.out.println("Has seleccionado la Opcion 1");
                    break;
                case "2":
                    System.out.println("Has seleccionado la Opcion 2");
                    break;
                case "3":
                    System.out.println("Has seleccionado la Opcion 3");
                    break;
                case "4":
                    salir = true; // Finalizar el bucle si se elige la opción 4
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
        
        // Mensaje de fin de programa
        System.out.println("Programa finalizado.");
        scanner.close();
    }
}
