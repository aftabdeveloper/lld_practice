package factory.pattern.good;

public class ApplePay implements PaymentMethod{
    @Override
    public void pay() {
        System.out.println("apple pay");
    }
}
