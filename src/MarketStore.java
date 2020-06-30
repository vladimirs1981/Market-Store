public class MarketStore {

    public void calculateDiscount (CreditCard card, double purchaseValue) {
        System.out.println(card.getClass().getName());
        System.out.println("Purchase value: $" + purchaseValue);
        System.out.println("Discount rate: " + card.getDiscountRate() + "%");
        System.out.println("Discount: $" + (purchaseValue * card.getDiscountRate())/100);
        System.out.println("Total: $" + (purchaseValue - (purchaseValue * card.getDiscountRate())/100) + "\n");
    }

}
