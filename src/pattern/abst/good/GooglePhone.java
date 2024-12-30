package pattern.abst.good;

public class GooglePhone implements Phone{
    @Override
    public void call() {
        System.out.println("Calling from google phone");
    }
}
