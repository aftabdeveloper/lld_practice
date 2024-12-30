package factory.pattern.good;

public class GooglePay implements PaymentMethod{
    @Override
    public void pay() {
        System.out.println("google pay");
    }
}
