package decorator.pattern;

public class Main {
    public static void main(String[] args) {
        //BasePizza basePizza = new Mergherita();
        BasePizza basePizza = new Mushroom(new ExtraCheese(new Mergherita()));
        System.out.println(basePizza.cost());
    }
}
