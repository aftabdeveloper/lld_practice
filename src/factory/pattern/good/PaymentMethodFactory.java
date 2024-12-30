package factory.pattern.good;

public class PaymentMethodFactory {
    public static PaymentMethod getPayment(String type){
        switch (type){
            case "google" : return new GooglePay();
            case "apple" : return new ApplePay();
            case "credit" : return new CreditcardPay();
            default: throw new IllegalArgumentException("Type not found");
        }
    }
}
