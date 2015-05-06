import java.util.ArrayList;
/**
 * Clase que define el tablón de noticias de la red
 * 
 * @author (Juan Carlos Aragón) 
 * @version (1.0)
 */
public class NewsFeed
{
    private ArrayList<Post> posts;
    
    /**
     * Constructor de la clase NewsFeed inicializa los atributos
     */
    public NewsFeed(){
        posts = new ArrayList<>();
    }
    /**
     * Añade un nuevo Post al timeline
     * 
     * @param post El post a añadir
     */
    public void addPost(Post post){
        posts.add(post);
    }

    /**
     * Muestra el timeLine por pantalla. Primero mensajes de texto y luego fotos
     */
    public void show(){
        if(posts.isEmpty()){
            System.out.println("El TimeLine está vacio");
        }
        else{
            for(Post post : posts){
                post.display();
            }
        }
    }
}
