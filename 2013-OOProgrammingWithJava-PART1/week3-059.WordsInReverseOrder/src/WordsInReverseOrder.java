import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WordsInReverseOrder {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // create here an ArrayList
        ArrayList<String> words = new ArrayList<String>();
        
        System.out.print("Type a word: ");
        String word = reader.nextLine();
        
        while(word.length()>0){
            words.add(word);
            System.out.print("Type a word: ");
            word = reader.nextLine();
            if(word.isEmpty()){
                Collections.reverse(words);
                break;
            }
        }
        for(String wordys : words){
            System.out.println(wordys);
        }
    }
}
