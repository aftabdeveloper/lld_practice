package factory.pattern.good;

public class Main {
    public static void main(String[] args) {
//        PaymentMethodFactory paymentMethodFactory = new PaymentMethodFactory();
        PaymentMethod paymentMethod1 = PaymentMethodFactory.getPayment("google");
        PaymentMethod paymentMethod2 = PaymentMethodFactory.getPayment("apple");
        PaymentMethod paymentMethod = PaymentMethodFactory.getPayment("credit");
        paymentMethod.pay();
    }
}
