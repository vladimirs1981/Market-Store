public class BronzeCard extends CreditCard{


    public BronzeCard(double turnover) {
        super(turnover);


        if (turnover < 100) {
            this.discountRate = 0.0;
        }else if (turnover >= 100 && turnover<= 300) {
            this.discountRate = 1;
        }else if (turnover > 300) {
            this.discountRate = 2.5;
        }
    }


    }


