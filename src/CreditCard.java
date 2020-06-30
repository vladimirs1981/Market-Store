public class CreditCard{

    public String ownerName;
    public double turnover;
    public double discountRate;

    public CreditCard(double turnover) {
        this.turnover = turnover;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getTurnover() {
        return turnover;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setTurnover(double turnover) {
        this.turnover = turnover;
    }

}

