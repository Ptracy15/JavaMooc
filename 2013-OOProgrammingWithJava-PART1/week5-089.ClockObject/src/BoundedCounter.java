
public class BoundedCounter {

    private int value;
    private int upperLimit;

    public BoundedCounter(int upperLimit) {
        this.upperLimit = upperLimit;
        this.value = 00;
    }

    public void next() {
        if (this.value < upperLimit) {
            this.value++;
        } else {
            this.value = 0;
        }

    }

    public String toString() {

        if (this.value < 10) {
            return "0"+  this.value;
        } else {
            return "" + this.value;
        }
    }

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        if (0 < value && value <= this.upperLimit) {
            this.value = value;
        }
    }

}
