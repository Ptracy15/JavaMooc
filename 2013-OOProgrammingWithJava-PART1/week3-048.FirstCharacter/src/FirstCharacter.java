import java.util.Scanner;

public class FirstCharacter {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.next();
        firstCharacter(name);
        
    }
    
    public static char firstCharacter(String text){
        char firstLetter = text.charAt(0);
        System.out.println(firstLetter);
        return firstLetter;
    }
}
