package observer.pattern;

public class TvDisplay implements Observer{
    @Override
    public void update(String weather) {
        System.out.println("Tv Display "+weather);
    }
}
