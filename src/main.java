public class main {
    public static void main(String [] args){
        pizzaStore ny = new nyStore();
        pizza p = ny.orderPizza("cheese");
        System.out.println("mai ordered a "+ p.getName());
    }
}
