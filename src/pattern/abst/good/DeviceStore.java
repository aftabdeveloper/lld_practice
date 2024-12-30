package pattern.abst.good;

public class DeviceStore {
    private Phone phone;
    private Tablet tablet;

    public DeviceStore(DeviceFactory deviceFactory){
        phone = deviceFactory.createPhone();
        tablet = deviceFactory.createTablet();
    }

    public void showDevices(){
        phone.call();
        tablet.browse();
    }
}
