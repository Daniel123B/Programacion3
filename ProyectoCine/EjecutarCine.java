import java.util.ArrayList;
import java.util.Scanner;

public class EjecutarCine {
    public static void main(String[] args) {
        boolean salir = false;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Pelicula> peliculas = new ArrayList<>();

        // Crear las salas
        Sala sala1 = new Sala(1, false);
        Sala sala2 = new Sala(2, false);
        Sala sala3 = new Sala(3, true);
        Sala[] salas = { sala1, sala2, sala3 };

        // Inicializar asientos
        sala1.inicializarAsientos();
        sala2.inicializarAsientos();
        sala3.inicializarAsientos();

        while (!salir) {
            // Imprimir el menú en la consola
            System.out.println("Bienvenido al programa del cine");
            System.out.println("Por favor seleccione una opción:");
            System.out.println("1. Crear pelicula");
            System.out.println("2. Asignar función");
            System.out.println("3. Ver funciones");
            System.out.println("4. Comprar boleta");
            System.out.println("5. Salir");
            System.out.print("Ingrese su opción: ");

            // Leer la opción ingresada por el usuario
            String opcion = scanner.nextLine();

            // Verificar la opción seleccionada
            switch (opcion) {
                case "1":
                    System.out.println("Ingrese el nombre de la pelicula: ");
                    String nombre = scanner.nextLine();
                    System.out.println("Ingrese el idioma: ");
                    String idioma = scanner.nextLine();
                    System.out.println("Ingrese el tipo (35mm o 3D): ");
                    String tipo = scanner.nextLine();
                    System.out.println("Ingrese la duracion en minutos: ");
                    int duracion = Integer.parseInt(scanner.nextLine());

                    peliculas.add(new Pelicula(nombre, idioma, tipo, duracion));
                    System.out.println("Pelicula creada exitosamente");
                    break;
                case "2":
                    if (peliculas.isEmpty()) {
                        System.out.println("No hay peliculas disponibles para asignar.");
                        break;
                    }
                    System.out.println("Peliculas disponibles:");
                    for (int i = 0; i < peliculas.size(); i++) {
                        System.out.println((i + 1) + ". " + peliculas.get(i).nombre);
                    }
                    System.out.println("Seleccione la pelicula (1-" + peliculas.size() + "): ");
                    int peliculax = Integer.parseInt(scanner.nextLine()) - 1;

                    System.out.println("Ingrese la sala (1, 2 o 3): ");
                    int salax = Integer.parseInt(scanner.nextLine()) - 1;
                    System.out.println("Horarios disponibles:");
                    System.out.println("1. 14:00 - 16:30");
                    System.out.println("2. 16:30 - 19:00");
                    System.out.println("3. 19:00 - 21:00");
                    System.out.print("Seleccione un horario (1-3): ");
                    int horariox = Integer.parseInt(scanner.nextLine()) - 1;

                    salas[salax].asignarPelicula(peliculas.get(peliculax), horariox);
                    break;
                case "3":
                    for (Sala sala : salas) {
                        sala.mostrarFunciones();
                    }
                    break;

                case "4":
                    System.out.print("Ingrese la sala (1,2 o 3): ");
                    int salaNum = Integer.parseInt(scanner.nextLine()) - 1;
                    salas[salaNum].mostrarAsientos();

                    System.out.print("Ingrese la fila (A-H): ");
                    char fila = scanner.nextLine().toUpperCase().charAt(0);
                    int filaNum = fila - 'A'; // Convertir la letra en índice

                    System.out.print("Ingrese el número de asiento (1-12): ");
                    int asiento = Integer.parseInt(scanner.nextLine()) - 1; // Convertir a índice de matriz

                    if (salas[salaNum].venderBoleta(filaNum, asiento)) {
                        System.out.println("Boleta comprada con éxito.");
                        salas[salaNum].mostrarAsientos(); // Mostrar la actualización de la sala
                    } else {
                        System.out.println("Asiento ocupado o inválido. Intente nuevamente.");
                    }
                    break;

                case "5":
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }

        System.out.println("Programa finalizado.");
        scanner.close();
    }
}
