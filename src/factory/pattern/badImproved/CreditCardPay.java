package factory.pattern.badImproved;

public class CreditCardPay implements PaymentMethod{
    @Override
    public void pay() {
        System.out.println("credit pay");
    }
}
