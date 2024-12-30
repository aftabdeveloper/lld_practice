package pattern.abst.good;

public class Main {
    public static void main(String[] args) {
        String company = "apple";
        DeviceFactory factory;

        if (company.equalsIgnoreCase("google")) {
            factory = new GoogleFactory();
        } else if(company.equalsIgnoreCase("apple")){
            factory = new AppleFactory();
        }else{
            throw new IllegalArgumentException("Company not found");
        }
        DeviceStore deviceStore = new DeviceStore(factory);
        deviceStore.showDevices();
    }

}
