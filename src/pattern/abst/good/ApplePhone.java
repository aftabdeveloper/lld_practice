package pattern.abst.good;

public class ApplePhone implements Phone{
    @Override
    public void call() {
        System.out.println("Calling from apple phone");
    }
}
