package factory.pattern.registry_based;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class PaymentFactory {
    private static final Map<String,Supplier<Payment>> registry = new HashMap<>();
    public static void register(String type, Supplier<Payment> supplier){
        registry.put(type,supplier);
    }

    public static Payment getPayment(String type){
        Supplier<Payment> supplier = registry.get(type);
        System.out.println("Available keys: " + registry.keySet());
        System.out.println(supplier);
        if(supplier == null){
            throw new IllegalArgumentException("Type not found");
        }
        return supplier.get();
    }


}
