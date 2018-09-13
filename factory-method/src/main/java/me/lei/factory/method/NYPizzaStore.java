package me.lei.factory.method;

public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if ("cheese".equals(type)) {
            return new NYCheesePizza();
        } else if ("veggie".equals(type)) {
            return new NYVeggiePizza();
        }
        return null;
    }
}
