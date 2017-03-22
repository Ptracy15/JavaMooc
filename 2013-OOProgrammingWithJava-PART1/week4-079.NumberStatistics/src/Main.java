import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // Write test code here
        // Remember to remove all the extra code when doing assignments  79.3 and 79.4
        
        // Define three NumberStatistics objects in your program:
        NumberStatistics sum = new NumberStatistics();
        NumberStatistics even = new NumberStatistics();
        NumberStatistics odd = new NumberStatistics();
        
        System.out.println("Type numbers: ");
        int value = Integer.parseInt(reader.nextLine());
        
        while(value != -1){
            sum.addNumber(value);
            if(value%2==0){
                even.addNumber(value);
            } else {
                odd.addNumber(value);
            }
            
            
            value = Integer.parseInt(reader.nextLine());
        }
        
        System.out.println("sum: " + sum.sum());
        System.out.println("sum of even: " + even.sum());
        System.out.println("sum of odd: " + odd.sum());
        
        
        // The first is used to track the sum of all given numbers.
        // The second takes care of even numbers and the third the odd numbers.

        // The tests does not work if you do not create the objects in the correct order
        
        

    }
}
