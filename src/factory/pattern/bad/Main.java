package factory.pattern.bad;

public class Main {
    public static void main(String[] args) {
        GooglePay googlePay = new GooglePay();
        googlePay.doPayment();

        ApplePay applePay = new ApplePay();
        applePay.process();

        CreditCardPay creditCardPay = new CreditCardPay();
        creditCardPay.pay();
  }
}
