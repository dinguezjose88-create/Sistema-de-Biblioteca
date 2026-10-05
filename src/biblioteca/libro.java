
package biblioteca;


public class libro {
   private  String titulo;
   private String autor;
   private int ISBN;
   private  boolean disponible;
   
   public libro(String titulo,String autor,int ISBN){
       this.titulo = titulo;
       this.autor = autor;
       this.ISBN = ISBN;
       this.disponible = true;
   
   
   }
   public String getTitulo() {
    return titulo;
}

public String getAutor() {
    return autor;
}

public int getISBN() {
    return ISBN;
}

public boolean isDisponible() {
    return disponible;
}
   
     public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

}
