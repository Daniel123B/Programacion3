import java.util.ArrayList;

class Cine {
    private ArrayList<Pelicula> peliculas;
    private Sala[] salas;

    public Cine() {
        peliculas = new ArrayList<>();
        salas = new Sala[]{new Sala(1, false), new Sala(2, false), new Sala(3, true)};
    }

    public void agregarPelicula(Pelicula pelicula) {
        peliculas.add(pelicula);
    }

    public Pelicula buscarPelicula(String nombre) {
        for (Pelicula p : peliculas) {
            if (p.getNombre().equalsIgnoreCase(nombre)) {
                return p;
            }
        }
        return null;
    }

    public Sala obtenerSala(int numero) {
        if (numero >= 1 && numero <= 3) {
            return salas[numero - 1];
        }
        return null;
    }
}
