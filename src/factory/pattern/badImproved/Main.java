package factory.pattern.badImproved;

public class Main {
    public static void main(String[] args) {
        PaymentMethod gPay = new GooglePay();
        gPay.pay();
        PaymentMethod aPay = new ApplePay();
        aPay.pay();
        PaymentMethod cPay = new CreditCardPay();
        cPay.pay();
    }
}
