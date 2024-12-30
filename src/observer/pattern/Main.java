package observer.pattern;

public class Main {
    public static void main(String[] args) {
        TvDisplay tvDisplay = new TvDisplay();
        MobileDisplay mobileDisplay = new MobileDisplay();

        WeatherStation weatherStation = new WeatherStation();
        weatherStation.addObserver(tvDisplay);
        weatherStation.addObserver(mobileDisplay);
        weatherStation.notifyObserver("Sunny");

    }
}
