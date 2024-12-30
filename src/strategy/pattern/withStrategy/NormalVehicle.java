package strategy.pattern.withStrategy;

public class NormalVehicle extends Vehicle {
    public NormalVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
