import java.util.ArrayList;
/**
 * Clase que representa un mensaje de texto
 * 
 * @author (Juan Carlos Aragón) 
 * @version (1.0)
 */
public class MessagePost extends Post
{
   //Atributos de la clase: 
   private String message;
   
   
   /**
    * Constructor de la clase MessagePost Inicializa todos los atributos
    * 
    * @param author El autor del mensaje
    * @param text El texto del mensaje
    */
   public MessagePost(String author, String text){
       super(author);
       message = text;
    }
    
   /**
    * Devuelve el texto del mensaje
    * 
    * @return El texto del mensaje
    */
   public String getText(){
       return message;
    }
    
   @Override
   /**
    * Muestra por pantalla el mensaje
    */
   public void display(){
       System.out.println("\n--------------------------------------------------------------");
       System.out.println(username.toUpperCase());
       System.out.println();
       System.out.println("\t" + message);
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
    
    /**
     * Imprime por pantalla el autor del mensaje
     */
    public void printShortSummary(){
        System.out.println("Esto es un post de texto creado por " + username);
    }
}
