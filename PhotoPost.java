import java.util.ArrayList;
/**
 * Clase que define un post con imagen
 * 
 * @author (Juan Carlos Aragón) 
 * @version (1.0)
 */
public class PhotoPost extends CommentPost
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

   /**
    * Muestra por pantalla el mensaje
    */
   public void display(){
       display("\t" + filename + "\n\t" + caption);
    }
}
