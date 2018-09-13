package me.lei.factory.simple;

public class PizzaStore {

    public Pizza makePizza(String type) {
        Pizza pizza = PizzaFactory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
