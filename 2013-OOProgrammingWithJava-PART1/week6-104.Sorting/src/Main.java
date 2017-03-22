
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // write testcode here
         
        int[] values = {-1, 6, 9, 8, 12};
        System.out.println(indexOfTheSmallestStartingFrom(values, 1));
        System.out.println(indexOfTheSmallestStartingFrom(values, 2));
        System.out.println(indexOfTheSmallestStartingFrom(values, 4));
        
        int[] values1 = {3, 2, 5, 4, 8};

        System.out.println(Arrays.toString(values1) );

        swap(values1, 1, 0);
        System.out.println(Arrays.toString(values1) );

        swap(values1, 0, 3);
        System.out.println(Arrays.toString(values1) );
        
        int[] values2 = {8, 3, 7, 9, 1, 2, 4};
        sort(values2);
    }
    
    public static int smallest(int[] array){
        int smallest = array[0];
        for(int i : array){
            if(i < smallest){
                smallest = i;
            }
        }
        return smallest;
    }
    
    public static int indexOfTheSmallest(int[] array){
        int smallest = smallest(array);
        int buffer = 0;
        
        for(int i : array) {
            if(i == smallest){
                break;
            }
            buffer++;
        }
        return buffer;
    }
    
    public static int indexOfTheSmallestStartingFrom(int[] array, int index){
        int small = array[index];
        for(int i = index; i < array.length; i++){
            if(small <= array[i]){
                
            } else {
                small= array[i];
                index = i;
            }
        }
        return index;
    }
    
    public static void swap(int[] array, int index1, int index2){
        int swap1 = array[index1];
        int swap2 = array[index2];
        
        array[index2] = swap1;
        array[index1] = swap2; 
    }
        
    public static void sort(int[] array){
        int index = 0;
        
        for(int i = 0; i<array.length; i++){
            int smallest = indexOfTheSmallestStartingFrom(array, index);
            swap(array, smallest, index);
            index++;
            System.out.println(Arrays.toString(array));
        }
    }
}    