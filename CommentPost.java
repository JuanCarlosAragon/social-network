import java.util.ArrayList;
/**
 * Write a description of class CommentPost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class CommentPost extends Post
{
    protected ArrayList<String> comments;
    
    public CommentPost(String author){
        super(author);
        comments = new ArrayList<>();
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
     * Muestra por pantalla el mensaje
     */
   public void display(String contenido){
       super.display(contenido);
       System.out.println(comments.size() + " comentarios.");
       for(String comment : comments){
          System.out.println("\n\t----------------");
          System.out.println("\t" + comment);
          System.out.println("\t----------------");
       }
       System.out.println("--------------------------------------------------------------");
    }
}
