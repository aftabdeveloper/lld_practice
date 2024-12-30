package decorator.pattern;

public class Mushroom extends ToppingDecorator{
    BasePizza basePizza;

    public Mushroom(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    public int cost(){
        return this.basePizza.cost()+10;
    }

}
