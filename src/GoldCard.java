public class GoldCard extends CreditCard{


    GoldCard(double turnover) {
        super(turnover);
        this.discountRate = 2;
        for (int i = 0; i < turnover/100; i++) {
            this.discountRate += 1;
            if (this.discountRate >= 10)
                this.discountRate = 10;

        }
    }
}
