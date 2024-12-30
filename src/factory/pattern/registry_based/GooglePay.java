package factory.pattern.registry_based;

public class GooglePay implements Payment{
    static {
        System.out.println("Registering GooglePay");
        PaymentFactory.register("google",GooglePay::new);
    }
    @Override
    public void pay() {
        System.out.println("google pay");
    }
}
