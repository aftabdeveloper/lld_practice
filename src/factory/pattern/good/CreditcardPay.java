package factory.pattern.good;

public class CreditcardPay implements PaymentMethod{
    @Override
    public void pay() {
        System.out.println("credit pay");
    }
}
