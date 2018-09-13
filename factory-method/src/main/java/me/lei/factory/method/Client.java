package me.lei.factory.method;

public class Client {

    public static void main(String[] args) {
        PizzaStore pizzaFactory = new NYPizzaStore();
        pizzaFactory.makePizza("cheese");
    }
}
