package strategy.pattern.withStrategy;

public class LuxryVehicle extends Vehicle{
    public LuxryVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
