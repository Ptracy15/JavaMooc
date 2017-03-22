
/**
 *
 * @author paul
 */
import java.util.Random;


public class NightSky {

    private double density;
    private int width;
    private int height;
    private int numberOfStars;

    public NightSky(double density) {
        this.density = density;
        this.width = 20;
        this.height = 10;
        this.numberOfStars = 0;
    }

    public NightSky(int width, int height) {
        this.density = 0.1;
        this.width = width;
        this.height = height;
        this.numberOfStars = 0;
    }

    public NightSky(double density, int width, int height) {
        this.density = density;
        this.width = width;
        this.height = height;
        this.numberOfStars = 0;
    }
    
    public void printLine(){
        Random random = new Random();
        double db = 0;
        for(int i = 0; i < this.width; i++){
            db = random.nextDouble();
            if(db < this.density){   // random number db is checked to see if below density
                this.numberOfStars++;
                System.out.print("*");  // if so it is printed
                
            }else{
                System.out.print(" ");  // if not it is a whitespace
            }
        }
        System.out.println("");
    }
    
    public void print(){
        for(int i = 0; i < this.height; i++){
                printLine();
            
        }
    }
    
    public int starsInLastPrint(){
        int starsNumber = this.numberOfStars;
        this.numberOfStars = 0;
        return starsNumber;
    }
}
