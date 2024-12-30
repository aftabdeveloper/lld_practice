package factory.pattern.registry_based;

public class ApplePay implements Payment{
    static {
        PaymentFactory.register("apple",ApplePay::new);
    }
    @Override
    public void pay() {
        System.out.println("apple pay");
    }
}
