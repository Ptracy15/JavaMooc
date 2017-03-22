import java.util.Scanner;


public class LastCharacter {


    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type your name: ");
        String name = reader.nextLine();
        lastCharacter(name);
        
    }
    
    public static char lastCharacter(String text){
        char lastCharacter = text.charAt(text.length()-1);
        System.out.println(lastCharacter);
        return lastCharacter;
    }
}
