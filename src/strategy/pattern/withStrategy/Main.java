package strategy.pattern.withStrategy;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new NormalVehicle(new SpecialDrive());
        Vehicle vehicle1 = new LuxryVehicle(new ExpreesDrive());
        vehicle.drive();
        vehicle1.drive();
    }
}
