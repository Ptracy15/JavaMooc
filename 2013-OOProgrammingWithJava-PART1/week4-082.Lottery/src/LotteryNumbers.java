import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;
    private Random random = new Random();

    public LotteryNumbers() {
        this.numbers = new ArrayList<Integer>();
        // Draw numbers as LotteryNumbers is created
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        // We'll format a list for the numbers
        this.numbers = new ArrayList<Integer>();
        // Write the number drawing here using the method containsNumber()
        int i = 0;
        int pick = 0;
        while(i < 7){
            pick = random.nextInt(39) + 1;
            if(!containsNumber(pick)){
                numbers.add(pick);
                i++;
            }           
        }
    }

    public boolean containsNumber(int number) {
        // Test here if the number is already in the drawn numbers
        
        return this.numbers.contains(number);
    }
}
