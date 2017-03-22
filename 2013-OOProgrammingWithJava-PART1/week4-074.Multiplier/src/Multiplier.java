
public class Multiplier {
    
    private int amount;
    
    public Multiplier(int amount){
        this.amount = amount;
    }
    
    public int multiply(int byThis){
        this.amount = this.amount * byThis;
        return this.amount;
    }
    
    public static void Main(String[] args){
        Multiplier threeMultiplier = new Multiplier(3);
        Multiplier fourMultiplier = new Multiplier(4);
        
        System.out.println("threeMultiplier.multiply(2): " + threeMultiplier.multiply(2));
        System.out.println("fourMultiplier.multiply(2): " + fourMultiplier.multiply(2));
        
        System.out.println("threeMultiplier.multiply(1): " + threeMultiplier.multiply(1));
        System.out.println("fourMultiplier.multiply(1): " + fourMultiplier.multiply(1));
    }
    
    
}
