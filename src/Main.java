public class Main {

    public static void main(String[] args) {


        MarketStore marketStore = new MarketStore();
        marketStore.calculateDiscount(new BronzeCard(0), 150);
        marketStore.calculateDiscount(new SilverCard(600),850);
        marketStore.calculateDiscount(new GoldCard(1500), 1300);

    }

}
