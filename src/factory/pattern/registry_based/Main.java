package factory.pattern.registry_based;

public class Main {
    public static void main(String[] args) {
        try {
            Class.forName("factory.pattern.registry_based.GooglePay");
            Class.forName("factory.pattern.registry_based.ApplePay");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Payment payment = PaymentFactory.getPayment("google");
        payment.pay();
        Payment payment1 = PaymentFactory.getPayment("apple");
        payment1.pay();
    }
}
