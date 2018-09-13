package me.lei.factory.simple;

/**
 * 简单工厂
 */
public class PizzaFactory {
    public static Pizza createPizza(String type) {
        if ("cheese".equals(type)) {
            return new CheesePizza();
        } else if ("veggie".equals(type)) {
            return new VeggiePizza();
        }
        return null;
    }
}
