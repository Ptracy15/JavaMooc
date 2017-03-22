
public class Main {

    public static void main(String[] args) {
        // write testcode here
        
        MyDate first = new MyDate(24, 12, 2009);
        MyDate second = new MyDate(1, 1, 2011);
        MyDate third = new MyDate(25, 12, 2010);
        
        System.out.println(first + "-" + second + " diference equals " + first.differenceInYears(second));
    }
}
