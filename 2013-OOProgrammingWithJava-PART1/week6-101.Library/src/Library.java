
/**
 *
 * @author paul
 */
import java.util.ArrayList;


public class Library {
    private ArrayList<Book> library = new ArrayList<Book>();
    
    
    public Library(){
        this.library = new ArrayList<Book>();
    }
    
    public void addBook(Book book){
        library.add(book);
    }
    
    public void printBooks(){
        for(Book b : library){
            System.out.println(b);
        }
    }
    
    public ArrayList<Book> searchByTitle(String title){
        ArrayList<Book> found = new ArrayList<Book>();
        
        for(Book b : library){
            if(StringUtils.included(b.title(), title)){
                found.add(b);
            }
        }
        return found;
    }
    
    public ArrayList<Book> searchByPublisher(String publisher){
        ArrayList<Book> found = new ArrayList<Book>();
        
        for(Book b : library){
            if(StringUtils.included(b.publisher(), publisher)){
                found.add(b);
            }
        }
        
        return found;
    }
    
    public ArrayList<Book> searchByYear(int year){
        ArrayList<Book> found = new ArrayList<Book>();
        
        for(Book b : library){
            if(b.year() == year){
                found.add(b);
            }
        }
        return found;
    }
    
    
    
    
}

