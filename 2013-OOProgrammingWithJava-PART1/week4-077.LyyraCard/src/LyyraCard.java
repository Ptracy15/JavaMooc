
public class LyyraCard {

    private double balance;

    public LyyraCard(double balanceStart) {
        this.balance = balanceStart;
    }

    //method for giving balance of the card
    public String toString() {
        return "The card has " + balance + " euros";
    }

    //method for payment for economic meal
    public void payEconomical() {
        if (this.balance > 2.49) {
            this.balance -= 2.50;
        }
    }

    //method for payment for gourment meal option
    public void payGourmet() {
        if (this.balance > 3.99) {
            this.balance -= 4.00;
        }
    }

    public void loadMoney(double amount) {
        if (amount > 0) {
            if (this.balance < 150) {
                this.balance += amount;
                if (this.balance > 150) {
                    this.balance = 150;
                }
            }
        }
    }

}
