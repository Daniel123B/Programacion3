public class Sala {
    boolean es3D;
    boolean preferencial;
    String[][] asientos;
    String[] pelicula;
    int numero;
    String[] horarios = {"14:00", "16:30", "18:00", "21:00"}; // Horarios disponibles
    int indiceHorario = 0; // índice para asignar la película

    public Sala(int numerox, boolean es3Dx){
        es3D = es3Dx;
        numero = numerox;

        if (numero == 1 || numero == 2) {
            asientos = new String[8][]; // 6 filas normales + 2 filas preferenciales
            for (int i = 0; i < 6; i++){
                asientos[i] = new String[12]; // Filas normales de 12 asientos
            }
            for (int i = 0; i < 8; i++){
                asientos[i] = new String[9]; // Filas preferenciales con 9 asientos
            }
        } else {
            asientos = new String[6][12]; // Salas normales con 6 filas
        }

        pelicula = new String[4];
    }

    public void inicializarAsientos() {
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                // Filas G y H en salas 1 y 2 son preferenciales y solo tienen 9 asientos
                if ((numero == 1 || numero == 2) && (i == 6 || i == 7)) {
                    asientos[i][j] = "P";  
                } else {
                    asientos[i][j] = "-";
                }
            }
        }
    }

    public void mostrarAsientos() {
        System.out.println("Asientos disponibles en sala " + numero + ":");
        System.out.print("   ");
        for (int j = 1; j <= 12; j++) {
            if (j <= asientos[0].length) { // Ajuste para evitar desbordamiento en preferenciales
                System.out.printf("%2d ", j);
            }
        }
        System.out.println();

        char filaLetra = 'A';
        for (int i = 0; i < asientos.length; i++) {
            System.out.print(filaLetra + "  ");
            for (int j = 0; j < asientos[i].length; j++) {
                System.out.print(asientos[i][j] + "  ");
            }
            System.out.println();
            filaLetra++;
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
    