package me.lei.factory.simple;

public class Client {

    public static void main(String[] args) {
        PizzaStore pizzaFactory = new PizzaStore();
        pizzaFactory.makePizza("cheese");
    }
}
