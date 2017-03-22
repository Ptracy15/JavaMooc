import java.util.Scanner;

public class Palindromi {

    public static boolean palindrome(String text) {
        // write code here
        int length = text.length()-1;
        int i = 0;
        String reverseWord = "";
        while (i<=length){
            char letter = text.charAt(length);
            reverseWord = reverseWord + letter;
            length-=1;
        }
        if(reverseWord.equals(text)){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        
        System.out.println("Type a text: ");
        String text = reader.nextLine();    
        if (palindrome(text)) {
            System.out.println("The text is a palindrome!");
        } else {
            System.out.println("The text is not a palindrome!");
        }
    }
}
