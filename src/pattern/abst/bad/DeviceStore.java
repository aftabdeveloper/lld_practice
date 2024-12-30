package pattern.abst.bad;

public class DeviceStore {
    GooglePhone googlePhone;
    ApplePhone applePhone;
    GoogleTablet googleTablet;
    AppleTablet appleTablet;

    public DeviceStore(String company){
        if(company.equalsIgnoreCase("google")){
            googlePhone = new GooglePhone();
            googleTablet = new GoogleTablet();
        }
        else if (company.equalsIgnoreCase("apple")){
            applePhone = new ApplePhone();
            appleTablet = new AppleTablet();
        }
    }

    public void showDevices(){
        if(googlePhone != null){
            googlePhone.call();
            googleTablet.browse();
        }
        else{
            applePhone.call();
            appleTablet.browse();
        }
    }
}
