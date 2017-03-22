
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Test your program here
        int[] array = {-3, 2, 3, 4, 7, 8, 12};
        Scanner input = new Scanner(System.in);

        System.out.print("Numbers in the array " + Arrays.toString(array));
        System.out.println();

        System.out.print("Enter searched number: ");
        String searchNumber = input.nextLine();
        System.out.println();

        boolean exists = BinarySearch.search(array, Integer.parseInt(searchNumber));

        // Print here the result
        if(exists){
            System.out.println("value " + searchNumber + " is in the array");
        } else {
            System.out.println("value " + searchNumber + " is not in the array");
        }
    }
}
