
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    public boolean larger(Apartment compared) {
        if (this.squareMeters > compared.squareMeters) {
            return true;
        }
        return false;
    }

    public int priceDifference(Apartment compared) {
        int difference;
        int price1 = this.pricePerSquareMeter * this.squareMeters;
        int price2 = compared.pricePerSquareMeter * compared.squareMeters;
        if (price1 > price2) {
            difference = price1 - price2;
        } else {
            difference = price2 - price1;
        }

        return difference;
    }
    
    public boolean moreExpensiveThan(Apartment compared){
        if(this.pricePerSquareMeter*this.squareMeters > compared.pricePerSquareMeter*compared.squareMeters){
            return true;
        }
        return false;
    }

}
