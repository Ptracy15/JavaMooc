
public class Counter {

    private int count;
    private boolean check;

    public Counter(int startingValue, boolean check) {
        this.count = startingValue;
        this.check = check;
    }

    public Counter(int startingValue) {
        this.count = startingValue;
        this.check = false;
    }

    public Counter(boolean check) {
        this.count = 0;
        this.check = check;
    }

    public Counter() {
        this(0, false);

    }

    public int value() {
        return this.count;
    }

    public void increase() {
        this.count++;
    }

    public void decrease() {
        if (this.check) {
            if (this.count > 0) {
                this.count--;
            }
        } else {
            this.count--;
        }
    }

    public void increase(int value) {

        if (value > 0) {
            this.count += value;
        }

    }

    public void decrease(int value) {
        if (this.check) {
            if (value > 0) {
                this.count -= value;
                if (this.count < 0) {
                    this.count = 0;
                }
            } else {
                return;
            }
           

        } else {
            if (value >= 0) {
                this.count -= value;
            }
        }
    }

}
