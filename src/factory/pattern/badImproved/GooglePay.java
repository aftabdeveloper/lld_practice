package factory.pattern.badImproved;

public class GooglePay implements PaymentMethod{
    @Override
    public void pay() {
        System.out.println("PAYMENT USING GOOGLEPAY");
    }
}
