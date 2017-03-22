

public class PrintingLikeBoss {

    // copy or rewrite the method of Assignment 39.1 here
    public static void printStars(int amount) {
        // 39.1
        // you can print one star with the command
        // System.out.print("*");
        // call this command amount times 
        int i = 0;
        while(i<amount){
            System.out.print("*");
            i++;
        }
        System.out.println();
    }

    public static void printWhitespaces(int amount) {
        // 40.1
        int i = 0;
        while(i<amount){
            System.out.print(" ");
            i++;
        }
    }

    public static void printTriangle(int size) {
        // 40.2
        int i=0;
        int count = 1;
        int amount = size-1;
        while(i<size){
            
        printWhitespaces(amount);
        printStars(count);
        i++;
        count++;
        amount--;
        }
        
    }

    public static void xmasTree(int height) {
        // 40.3
        int i=0;
        int count =1;
        int amount = height-1;
        
        while(i<height){
        printWhitespaces(amount);
        printStars(count);
        i++;
        count+=2;
        amount--;
        }
        printWhitespaces((count/2)-2);
        printStars(3);
        printWhitespaces((count/2)-2);
        printStars(3);
    }

    public static void main(String[] args) {
        // Tests do not use main, yo can write code here freely!

        printTriangle(5);
        System.out.println("---");
        xmasTree(4);
        System.out.println("---");
        xmasTree(10);
    }
}
