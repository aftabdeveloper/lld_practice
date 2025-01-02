package builder.pattern;

public class Main {
    public static void main(String[] args) {
        Mobile iphone = new Mobile.MobileBuilder("Apple","red","iphone15")
                .setBattery(4500)
                .setCamera(32)
                .setFrontCamera(true)
                .setEnabled(true)
                .setRam(64)
                .setPrice(1500)
                .build();
        System.out.println(iphone);
    }
}
