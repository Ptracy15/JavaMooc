
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<Bird> db = new ArrayList<Bird>();

        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.print("?");
            String input = scanner.nextLine();
            
            if(input.equals("Add")){
                System.out.println("Name: ");
                String name = scanner.nextLine();
                System.out.println("Latin Name: ");
                String latinName = scanner.nextLine();
                Bird tempBird = new Bird(name, latinName);
                db.add(tempBird);
            }
            
            if(input.equals("Observation")){
                System.out.println("What was observed: ?");
                String name = scanner.nextLine();
                
                for(Bird i : db){
                    if(i.getName().equals(name)){
                        i.observed();
                    } else {
                        System.out.println("Is not a bird!");
                    }
                }
            }
            
            if(input.equals("Statistics")){
                for(Bird i : db){
                    System.out.println(i);
                }
            }
            
            if(input.equals("Show")){
                System.out.println("What?");
                String name = scanner.nextLine();
                
                for(Bird i : db){
                    if(i.getName().equals(name)){
                        System.out.println(i);
                    }
                }
            }
            
            if(input.equals("Quit")){
                break;
            }
        }
    // implement your program here
        // do not put all to one method/class but rather design a proper structure to your program

    // Your program should use only one Scanner object, i.e., it is allowed to call 
        // new Scanner only once. If you need scanner in multiple places, you can pass it as parameter
    }

}
