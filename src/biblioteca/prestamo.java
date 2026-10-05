
package biblioteca;
import java.time.LocalDate;


public class prestamo {
    
    private LocalDate fecha;
    private Usuario usuario;
    private libro libro;
    
    public prestamo(LocalDate fecha,Usuario usuario, libro libro ){
       this.fecha = fecha;
        this.usuario = usuario;
        this.libro = libro;
    }
      public LocalDate getFecha() {
        return fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public libro getLibro() {
        return libro;
    }
    
    
    
    
    
}
