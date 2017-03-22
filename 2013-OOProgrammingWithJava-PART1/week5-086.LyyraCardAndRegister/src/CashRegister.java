
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        // at start the register has 1000 euros 
        this.cashInRegister = 1000;
        this.economicalSold = 0;
        this.gourmetSold = 0;
    }

    public double payEconomical(double cashGiven) {

        if (cashGiven >= 2.50) {
            double change = cashGiven - 2.50;
            this.cashInRegister += 2.50;
            this.economicalSold++;
            return change;
        }

        return cashGiven;
    }

    public double payGourmet(double cashGiven) {

        if (cashGiven >= 4.00) {
            double change = cashGiven - 4.00;
            this.cashInRegister += 4;
            this.gourmetSold++;
            return (int) change;
        }

        return cashGiven;
    }

    public boolean payEconomical(LyyraCard card) {

        if (card.balance() >= 2.50) {
            card.pay(2.50);
            this.economicalSold++;
            return true;
        }

        return false;
    }

    public boolean payGourmet(LyyraCard card) {
        if (card.balance() >= 4.00) {
            card.pay(4.00);
            this.gourmetSold++;
            return true;
        }

        return false;
    }

    public void loadMoneyToCard(LyyraCard card, double sum) {
        if (sum >= 0) {
            card.loadMoney(sum);
            this.cashInRegister += sum;
        }
    }

    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}
