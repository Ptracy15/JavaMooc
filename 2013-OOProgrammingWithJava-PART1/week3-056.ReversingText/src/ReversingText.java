
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        // write your code here
        // note that method does now print anything, it RETURNS the reversed string
        int length = text.length()-1;
        int i = 0;
        String reverseWord = "";
        while (i<=length){
            char letter = text.charAt(length);
            reverseWord = reverseWord + letter;
            length-=1;
        }
        return reverseWord;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
