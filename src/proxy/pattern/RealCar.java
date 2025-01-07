package proxy.pattern;

public class RealCar implements Car{

    private String model;

    RealCar(String model){
        this.model = model;
    }

    @Override
    public void drive() {
        System.out.println("Driving "+model);
    }
}
