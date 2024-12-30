package factory.pattern.badImproved;

public class ApplePay implements PaymentMethod{
    @Override
    public void pay() {
        System.out.println("apple pay");
    }
}
