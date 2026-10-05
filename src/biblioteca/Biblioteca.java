
package biblioteca;


public class Biblioteca {

   
    public static void main(String[] args) {
        
// Crear un libro
        libro libro1 = new libro("Don Quijote", "Miguel de Cervantes", 12345);

        // Crear un usuario
        Usuario usuario1 = new Usuario("Jose", 1);

        // Mostrar información del libro
        System.out.println("Libro: " + libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("Disponible: " + libro1.isDisponible());

        // Prestar el libro
        usuario1.prestarLibro(libro1);

        System.out.println("Después del préstamo:");
        System.out.println("Disponible: " + libro1.isDisponible());

        // Devolver el libro
        usuario1.devolverLibro(libro1);

        System.out.println("Después de devolverlo:");
        System.out.println("Disponible: " + libro1.isDisponible());
    }
    
    
}
