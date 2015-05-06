import java.util.ArrayList;
/**
 * Clase que define un post con imagen
 * 
 * @author (Juan Carlos Aragón) 
 * @version (1.0)
 */
public class PhotoPost extends Post
{
   private String filename;
   private String caption;
   
   
   /**
    * Constructor de la clase PhotoPost, Inicializa todos los atributos
    * 
    * @param author El autor del post
    * @param filename El archivo de foto enlazado
    * @param caption El subtítulo asignado a la imagen
    */
   public PhotoPost(String author, String filename, String caption){
       super(author);
       this.filename = filename;
       this.caption = caption;
    }
    
   /**
    * Devuelve la ruta de la imagen del post
    * 
    * @return El archivo enlazado (en formato de ruta)
    */
   public String getImageFile(){
       return filename;
    }
    
   /**
    * Devuelve el subtitulo de la imagen del post
    * 
    * @return El subtitulo de la clase del post
    */
   public String getCaption(){
       return caption;
    }

    @Override
   /**
    * Muestra por pantalla el mensaje
    */
   public void display(){
       System.out.println("\n--------------------------------------------------------------");
       System.out.println(username.toUpperCase());
       System.out.println();
       System.out.println("\t" + filename);
       System.out.println("\t" + caption);
       System.out.println();
       System.out.println("Hace " + timeString(System.currentTimeMillis()));
       System.out.println();
       System.out.println(likes + " Me gusta.");
       System.out.println(comments.size() + " comentarios.");
       for(String comment : comments){
           System.out.println("\n\t----------------");
           System.out.println("\t" + comment);
           System.out.println("\t----------------");
        }
       System.out.println("--------------------------------------------------------------");
       
    }
}
