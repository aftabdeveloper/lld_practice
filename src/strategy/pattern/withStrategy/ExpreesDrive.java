package strategy.pattern.withStrategy;

public class ExpreesDrive implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Express Drive");
    }
}
