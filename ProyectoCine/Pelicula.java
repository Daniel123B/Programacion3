public class Pelicula {
    String nombre;
    String idioma;
    String tipo;
    int duracion;

    public Pelicula(String nombre, String idioma, String tipo, int duracion){
        this.nombre = nombre;
        this.idioma = idioma;
        this.tipo = tipo;
        this.duracion = duracion;
    }
    public String getNombre() {
        return nombre;
    }
    public String getTipo() { 
        return tipo; 
    }
}
