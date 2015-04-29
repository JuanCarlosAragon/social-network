import java.util.ArrayList;
/**
 * Clase que representa un mensaje de texto
 * 
 * @author (Juan Carlos Aragón) 
 * @version (1.0)
 */
public class MessagePost
{
   //Atributos de la clase: 
   private String username;
   private String message;
   private long timeStamp;
   private int likes;
   private ArrayList<String> comments;
   
   
   /**
    * Constructor de la clase MessagePost Inicializa todos los atributos
    * 
    * @param author El autor del mensaje
    * @param text El texto del mensaje
    */
   public MessagePost(String author, String text){
       username = author;
       message = text;
       timeStamp = System.currentTimeMillis();
       likes = 0;
       comments = new ArrayList<>();
    }
    
   /**
    * Añade un like al mensaje
    */
   public void like(){
       likes++;
    }
    
   /**
    * Quita un like al mensaje
    */
   public void unLike(){
       if(likes > 0){
           likes--;
        }
    }
    
   /**
    * Añade un comentario al mensaje
    * 
    * @param text El texto del comentario
    */
   public void addComment(String text){
       comments.add(text);
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
    * Devuelve el tiempo transcurrido en milisegundos desde la medianoche del 1 de enero de 1970 hasta el momento de la creación del mensaje
    * 
    * @return tiempo en milisegundos transcurridos hasta la creación del mensaje
    */
   public long getTimeStamp(){
       return timeStamp;
    }
    
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
    
   /*
    * METODO PRIVADO, que calcula el tiempo transcurrido desde que se creó el mensaje hasta el momento que se le pasa como parametro y lo
    * devuelve como una cadena de texto
    * 
    * @param time el tiempo actual cogido como referencia para el intervalo
    * 
    * @return una cadena de texto con el tiempo transcurrido
    */
   private String timeString(long time){
       int segundosTranscurridos = (int) ((time - timeStamp)/1000);
       
       int minutosTranscurridos = (segundosTranscurridos / 60);
       int restoSegundos = segundosTranscurridos % 60;
       
       String tiempo = new String();
       if(minutosTranscurridos > 0){
           tiempo += minutosTranscurridos + " minutos ";
        }
       tiempo += restoSegundos + " segundos.";
       
       return tiempo;
    }
}
