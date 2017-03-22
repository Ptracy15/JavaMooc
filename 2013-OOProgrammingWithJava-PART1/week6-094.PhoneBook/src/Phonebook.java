
import java.util.ArrayList;

public class Phonebook {

    private ArrayList<Person> phoneBook;

    public Phonebook() {
        this.phoneBook = new ArrayList<Person>();
    }

    public void add(String name, String number) {
        Person newPerson = new Person(name, number);
        this.phoneBook.add(newPerson);
    }

    public void printAll() {
        for (Person p : this.phoneBook) {
            System.out.println(p);
        }
    }
    
    public String searchNumber(String name){
        for(Person p : this.phoneBook){
            if(p.getName().equals(name)){
                return p.getNumber();
            }
        }
        return "number not known";
    }
}
