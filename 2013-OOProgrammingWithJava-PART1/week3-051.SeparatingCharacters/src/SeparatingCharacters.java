
import java.util.Scanner;

public class SeparatingCharacters {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = reader.nextLine();
        
//        if(name.length() < 3){
//            System.out.println("");
//        } else {
            int characterCount = 0;
            int count = 1;
            
            while(characterCount < name.length()){
                char letter = name.charAt(characterCount);
                System.out.println(count + ". " + "character: " + letter);
                characterCount++;
                count++;
            }
        }
    }

