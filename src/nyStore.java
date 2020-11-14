public class nyStore extends pizzaStore{
    pizza createPizza(String item) {
            if (item.equals("cheese")) {
                return new nyStyle();
            } else if (item.equals("veggie")) {
                return new nyStyle();
            } else if (item.equals("clam")) {
                return new nyStyle();
            } else if (item.equals("pepperoni")) {
                return new nyStyle();
            } else return null;
        }
    }

