import java.util.ArrayList;

public abstract class pizzaStore {

    public pizza orderPizza(String type) {
        pizza pizza;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
    abstract pizza createPizza(String type);


}
