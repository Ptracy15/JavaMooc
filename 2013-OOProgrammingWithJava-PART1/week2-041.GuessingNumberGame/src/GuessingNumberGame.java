
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int guessAmount = 0;
        int guessCount = 1;

        // program your solution here. Do not touch the above lines!
        while (guessAmount != numberDrawn){
        System.out.print("Guess a number: ");
        guessAmount = Integer.parseInt(reader.nextLine());
        
        if(guessAmount != numberDrawn){
            if(guessAmount < numberDrawn){
                System.out.println("The number is greater, guesses made: " + guessCount);
                
            } else {
                System.out.println("The number is lesser, guesses made: " + guessCount);
            }
        } else {
            System.out.println("Congratulations, your guess is correct");
        }
        guessCount++;
        }
    }

    // DO NOT MODIFY THIS!
    private static int drawNumber() {
        return new Random().nextInt(101);
    }
}
