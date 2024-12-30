package observer.pattern;

public class MobileDisplay implements Observer{
    @Override
    public void update(String weather) {
        System.out.println("Mobile Display "+weather);
    }
}
