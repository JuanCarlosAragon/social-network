import java.util.ArrayList;
/**
 * Clase que define el tablón de noticias de la red
 * 
 * @author (Juan Carlos Aragón) 
 * @version (1.0)
 */
public class NewsFeed
{
    private ArrayList<MessagePost> messages;
    private ArrayList<PhotoPost> photos;
    
    /**
     * Constructor de la clase NewsFeed inicializa los atributos
     */
    public NewsFeed(){
        messages = new ArrayList<>();
        photos = new ArrayList<>();
    }
    /**
     * Añade un nuevo Post de texto al timeline
     * 
     * @param message El mensaje a añadir
     */
    public void addMessagePost(MessagePost message){
        messages.add(message);
    }
    
    /**
     * Añade un nuevo Post de imagen al timeline
     * 
     * @param photo El post de foto a añadir
     */
    public void addPhotoPost(PhotoPost photo){
        photos.add(photo);
    }
    
    /**
     * Muestra el timeLine por pantalla. Primero mensajes de texto y luego fotos
     */
    public void show(){
        if(messages.isEmpty() && photos.isEmpty()){
            System.out.println("El TimeLine está vacio");
        }
        else{
            for(MessagePost message : messages){
                message.display();
            }
            for(PhotoPost photo : photos){
                photo.display();
            }
        }
    }
}
