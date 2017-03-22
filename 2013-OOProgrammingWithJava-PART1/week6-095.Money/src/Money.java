
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public Money plus(Money added) {
        int euroSum = euros + added.euros;
        int centSum = cents + added.cents;

        if (centSum > 99) {
            centSum -= 100;
            euroSum++;
        }

        return new Money(euroSum, centSum);
    }

    public boolean less(Money compared) {
        if (this.euros > compared.euros) {
            return false;
        } else if (this.euros == compared.euros && this.cents > compared.cents) {
            return false;
        } else {
            return true;
        }
    }

    public Money minus(Money decreased) {
        int euroSum = euros - decreased.euros;
        int centSum = cents - decreased.cents;

        if (centSum < 0) {
            centSum += 100;
            euroSum--;
            if (euroSum < 0) {
                euroSum = 0;
            }
        }

        if (euroSum < 0) {
            return new Money(0, 0);
        }
        return new Money(euroSum, centSum);
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

}
