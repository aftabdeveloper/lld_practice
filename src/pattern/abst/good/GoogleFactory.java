package pattern.abst.good;

public class GoogleFactory implements DeviceFactory{
    @Override
    public Phone createPhone() {
        return new GooglePhone();
    }

    @Override
    public Tablet createTablet() {
        return new GoogleTablet();
    }
}
