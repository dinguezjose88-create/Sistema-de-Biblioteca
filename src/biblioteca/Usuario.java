
package biblioteca;
import java.util.ArrayList;
import java.util.List;


public class Usuario {
    private String nombre;
    private int id;
    private List<libro> librosPrestados;
    
    
    public Usuario(String nombre, int id){
        this.nombre = nombre;
        this.id = id;
        this.librosPrestados = new ArrayList<>();
    
    }
     public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public List<libro> getLibrosPrestados() {
        return librosPrestados;
    }
    
     
    public void prestarLibro(libro libro) {
        if (libro.isDisponible()) {
            librosPrestados.add(libro);
            libro.setDisponible(false);
        }
    }
    
    public void devolverLibro(libro libro) {
        if (librosPrestados.remove(libro)) {
            libro.setDisponible(true);
        }
    }
    
}
