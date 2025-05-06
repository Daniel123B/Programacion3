package ProyectoJDMKVIDA.jmdkvida;
import java.util.Date;

public interface ContenidoEducativo {
    Date getFechaCreacion();
    Usuario getAutor();
    void mostrarContenido();
    void editarContenido(String nuevoContenido);
    void eliminarContenido();
}