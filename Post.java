import java.util.ArrayList;
/**
 * Write a description of class Post here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Post
{
   protected String username;
   protected long timeStamp;
   protected int likes;
   protected ArrayList<String> comments;
   
   public Post(String author){
       username = author;
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
   public void display(String contenido){
       System.out.println("\n--------------------------------------------------------------");
       System.out.println(username.toUpperCase());
       System.out.println();
       System.out.println(contenido);
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
   protected String timeString(long time){
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
    
     /**
    * Metodo abstracto que obliga a implementar dicho metodo a las hijas
    * 
    */
   public abstract void display();
    
}
