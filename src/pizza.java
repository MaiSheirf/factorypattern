import java.util.ArrayList;

public class pizza {

    String name;
    ArrayList toppings = new ArrayList();

    public void prepare() {
        System.out.println("preparing" + name);
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println(toppings.get(i));
        }
    }
    void bake() {
        System.out.println("Bake for 25 minutes at 350");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }
    void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }
    public String getName() {
        return name;
    }
}
