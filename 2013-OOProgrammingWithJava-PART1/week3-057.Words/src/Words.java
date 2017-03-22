import java.util.ArrayList;
import java.util.Scanner;

public class Words {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<String>();
        
        String word = "";
        System.out.print("Type a word: ");
        word = reader.nextLine();
        
        while(word.length()>0){
            words.add(word);
            System.out.print("Type a word: ");
            word = reader.nextLine();
            if(word.isEmpty()){
                break;
            }
        }
        
        for (String wordys : words){
            System.out.println(wordys);
        }
        
        
        
        
        
        
        
    }
}
