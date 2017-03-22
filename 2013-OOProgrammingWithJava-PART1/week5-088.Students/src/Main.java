
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write here the main program
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<Student>();

        System.out.print("name: ");
        String name = scanner.nextLine();
        System.out.print("studentnumber: ");
        String id = scanner.nextLine();

        while (!name.isEmpty()) {
            Student student = new Student(name, id);
            list.add(student);
            System.out.print("name: ");
            name = scanner.nextLine();
            if(name.isEmpty()){
                break;
            }
            System.out.print("studentnumber: ");
            id = scanner.nextLine();
        }
        
        for (Student s : list){
            System.out.println(s);
        }
        
        System.out.print("Give a search term: ");
        String search = scanner.nextLine();
        System.out.println("Result: ");
        
        for(Student s: list){
            if(s.getName().contains(search)){
                System.out.println(s);
            }
        }

    }
}
