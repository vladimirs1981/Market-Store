public class SilverCard extends BronzeCard{


    SilverCard(double turnover) {
        super(turnover);

        if (turnover > 300)
            this.discountRate = 3.5;
        else
            this.discountRate = 2;
    }
}
