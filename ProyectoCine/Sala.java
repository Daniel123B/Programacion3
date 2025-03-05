public class Sala {
    boolean es3D;
    boolean preferencial;
    String[][] asientos;
    String[] pelicula;
    int numero;
    String[] horarios = {"10:00", "15:00", "18:00", "20:00"}; // Horarios disponibles
    int indiceHorario = 0; // índice para asignar la película

    public Sala(int numerox, boolean es3Dx, boolean preferencialx) {
        es3D = es3Dx;
        preferencial = preferencialx;
        numero = numerox;

        // Si es sala 1 o 2, agregar las filas preferenciales (G, H)
        if (numero == 1 || numero == 2) {
            asientos = new String[8][12]; // 6 filas normales + 2 filas preferenciales
        } else {
            asientos = new String[6][12]; // Salas normales con 6 filas
        }

        pelicula = new String[3];
    }

    public void inicializarAsientos() {
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                // Filas G y H en salas 1 y 2 son preferenciales y solo tienen 9 asientos
                if ((numero == 1 || numero == 2) && (i == 6 || i == 7) && j < 9) {
                    asientos[i][j] = "P";  
                } else {
                    asientos[i][j] = "-";
                }
            }
        }
    }

    public void mostrarAsientos() {
        System.out.println("Asientos disponibles en sala " + numero);
        char filaLetra = 'A'; // Letras para las filas generales

        for (int i = 0; i < asientos.length; i++) {
            System.out.print(filaLetra + " ");

            for (int j = 0; j < asientos[i].length; j++) {
                // Evitar mostrar espacios extra en los asientos preferenciales
                if ((numero == 1 || numero == 2) && (i == 6 || i == 7) && j >= 9) {
                    continue;
                }
                System.out.print(asientos[i][j] + " ");
            }
            System.out.println();
            
            // Para las filas preferenciales usamos G y H en lugar de seguir con letras normales
            if (numero == 1 || numero == 2) {
                if (i == 5) filaLetra = 'G';
                else if (i == 6) filaLetra = 'H';
            } else {
                filaLetra++; // Avanzar a la siguiente letra normal
            }
        }
    }


    public boolean venderBoletos(int fila, int columna) {
        if (fila < 0 || fila >= asientos.length || columna < 0 || columna >= asientos[fila].length) {
            return false; // Verificar si la posición está dentro del rango de asientos
        }
        if (asientos[fila][columna].equals("-") || asientos[fila][columna].equals("p")) { // Verificar si el asiento está vacío
            asientos[fila][columna] = "X"; // Marcar el asiento como ocupado
            return true;
        }
        return false; // Si el asiento ya está ocupado
    }

    public void asignarPelicula(String nombrePelicula, int hora) {
        if (es3D && !nombrePelicula.contains("3D")) { // Verificar si la sala es 3D
            System.out.println("Solo se puede asignar una película 3D a la sala 3D.");
            return;
        }

        if (indiceHorario < horarios.length) {
            pelicula[indiceHorario] = nombrePelicula; // Asignar la película a un horario
            System.out.println("Película '" + nombrePelicula + "' asignada a la sala " + numero + " a las " + horarios[indiceHorario]);
            indiceHorario++; // Avanzar al siguiente horario
        } else {
            System.out.println("No hay más horarios disponibles para asignar películas.");
        }
    }

    public void mostrarPelicula() {
        System.out.println("Películas disponibles en la sala " + numero);
        for (int i = 0; i < pelicula.length; i++) {
            if (pelicula[i] != null) {
                System.out.println(horarios[i] + ": " + pelicula[i]);
            }
        }
    }
}
    