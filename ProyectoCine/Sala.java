public class Sala {
    boolean es3D;
    boolean preferencial;
    String[][] asientos;
    String[] pelicula;
    int numero;
    String[] horarios = {"14:00 - 16:30", "16:30 - 19:00", "19:00 - 21:00"}; // Horarios disponibles
    int indiceHorario = 0; // índice para asignar la película

    public Sala(int numerox, boolean es3Dx){
        es3D = es3Dx;
        numero = numerox;

        if (numero == 1 || numero == 2) {
            asientos = new String[8][]; // 6 filas normales + 2 preferenciales
        
            // Primero se crean todas las filas con el tamaño correcto
            for (int i = 0; i < 8; i++) {
                if (i < 6) {
                    asientos[i] = new String[12]; // Filas normales con 12 asientos
                } else {
                    asientos[i] = new String[9]; // Filas preferenciales con 9 asientos
                }
            }
        } else {
            asientos = new String[6][12]; // Salas normales con 6 filas de 12 asientos
        }
        
        pelicula = new String[3]; // Solo hay 3 horarios
        inicializarAsientos();
        
    }

    public void inicializarAsientos() {
        for (int i = 0; i < asientos.length; i++) {
            for (int j = 0; j < asientos[i].length; j++) {
                if ((numero == 1 || numero == 2) && (i >= 6)) {
                    asientos[i][j] = "P";  // Preferenciales
                } else {
                    asientos[i][j] = "-"; // Asientos normales
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

    public void mostrarFunciones() {
        System.out.println("Funciones de la sala " + numero);
        for (int i = 0; i < horarios.length; i++) {
            if (pelicula[i] != null) {
                System.out.println(horarios[i] + ": " + pelicula[i]);
            } else {
                System.out.println(horarios[i] + ": No hay película asignada");
            }
        }
    }

    public boolean venderBoleta(int fila, int columna) {
        if (fila < 0 || fila >= asientos.length || columna < 0 || columna >= asientos[fila].length) {
            return false; // Verificar si la posición está dentro del rango de asientos
        }
        if (asientos[fila][columna].equals("X")) { // Verificar si ya está ocupado
            return false; // No se puede comprar un asiento ya vendido
        }
        if (asientos[fila][columna].equals("-") || asientos[fila][columna].equals("P")) { // Verificar si está disponible
            asientos[fila][columna] = "X"; // Marcar el asiento como ocupado
            return true;
        }
        return false; // En caso de que el estado del asiento no sea válido
    }
    
    

    public void asignarPelicula(Pelicula pelicula, int hora) {
        if (es3D && !pelicula.getNombre().contains("3D")) {
            System.out.println("Solo se puede asignar una película 3D a la sala 3D.");
            return;
        }
    
        if (indiceHorario < horarios.length) {
            this.pelicula[indiceHorario] = pelicula.getNombre(); // Asignar la película al horario
            System.out.println("Película '" + pelicula.getNombre() + "' asignada a la sala " + numero + " a las " + horarios[indiceHorario]);
            indiceHorario++;
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
    