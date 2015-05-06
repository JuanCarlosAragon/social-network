
/**
 * Write a description of class JounGroupPost here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class JounGroupPost extends Post
{
    public JounGroupPost(String author){
        super(author);
    }
    public void display(){
        display("\tSe unió a un grupo");
        System.out.println("--------------------------------------------------------------");
    }
}
