package pattern.abst.good;

public class AppleFactory implements DeviceFactory{
    @Override
    public Phone createPhone() {
        return new ApplePhone();
    }

    @Override
    public Tablet createTablet() {
        return new AppleTablet();
    }
}
