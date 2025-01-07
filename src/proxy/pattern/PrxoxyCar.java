package proxy.pattern;

public class PrxoxyCar implements Car{
    private String model;
    private boolean hasDrivingLicense;
    private RealCar realCar;

    public PrxoxyCar(String model, boolean hasDrivingLicense) {
        this.model = model;
        this.hasDrivingLicense = hasDrivingLicense;
    }

    @Override
    public void drive() {
        if(hasDrivingLicense){
            if(realCar == null){
                realCar = new RealCar(model);
            }
            realCar.drive();
        }
        else {
            throw new RuntimeException("You are not eligible to drive");
        }
    }
}
