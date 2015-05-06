import java.util.ArrayList;
/**
 * Clase que representa un mensaje de texto
 * 
 * @author (Juan Carlos Aragón) 
 * @version (1.0)
 */
public class MessagePost extends CommentPost
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
    
   /**
    * Muestra por pantalla el mensaje
    */
   public void display(){
       display(("\t" + message));
    }
    
    /**
     * Imprime por pantalla el autor del mensaje
     */
    public void printShortSummary(){
        System.out.println("Esto es un post de texto creado por " + username);
    }
}
