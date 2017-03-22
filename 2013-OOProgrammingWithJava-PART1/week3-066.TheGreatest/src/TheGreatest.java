import java.util.ArrayList;
import java.util.Arrays;

public class TheGreatest {
    public static int greatest(ArrayList<Integer> list) {
        // write code here
        int greatestNumber = list.get(0);
        for(int numbers : list){
            if( numbers > greatestNumber){
                greatestNumber = numbers;
            }
        }
        return greatestNumber;
    }

    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        lista.add(3);
        lista.add(2);
        lista.add(7);
        lista.add(2);
        
        System.out.println("The greatest number is: " + greatest(lista));
    }
}