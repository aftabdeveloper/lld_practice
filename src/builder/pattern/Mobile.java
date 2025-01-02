package builder.pattern;

public class Mobile {
    private String brand;
    private String color;
    private String model;
    private int ram;
    private int sdCard;
    private int camera;
    private boolean frontCamera;
    private boolean isEnabled;
    private int battery;
    private double price;

    private Mobile(MobileBuilder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.color = builder.color;
        this.ram = builder.ram;
        this.sdCard = builder.sdCard;
        this.camera = builder.camera;
        this.frontCamera = builder.frontCamera;
        this.isEnabled = builder.isEnabled;
        this.battery = builder.battery;
        this.price = builder.price;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                ", ram=" + ram +
                ", sdCard=" + sdCard +
                ", camera=" + camera +
                ", frontCamera=" + frontCamera +
                ", isEnabled=" + isEnabled +
                ", battery=" + battery +
                ", price=" + price +
                '}';
    }


    public static class MobileBuilder {
        private String brand;
        private String color;
        private String model;
        private int ram;
        private int sdCard;
        private int camera;
        private boolean frontCamera;
        private boolean isEnabled;
        private int battery;
        private double price;

        public MobileBuilder(String brand, String color, String model) {
            this.brand = brand;
            this.color = color;
            this.model = model;
        }

        public MobileBuilder setRam(int ram) {
            this.ram = ram;
            return this;
        }

        public MobileBuilder setSdcard(int sdCard) {
            this.sdCard = sdCard;
            return this;
        }

        public MobileBuilder setCamera(int camera) {
            this.camera = camera;
            return this;
        }

        public MobileBuilder setFrontCamera(boolean frontCamera) {
            this.frontCamera = frontCamera;
            return this;
        }

        public MobileBuilder setEnabled(boolean isEnabled) {
            this.isEnabled = isEnabled;
            return this;
        }

        public MobileBuilder setBattery(int battery) {
            this.battery = battery;
            return this;
        }

        public MobileBuilder setPrice(int price) {
            this.price = price;
            return this;
        }

        public Mobile build() {
            return new Mobile(this);
        }
    }
}