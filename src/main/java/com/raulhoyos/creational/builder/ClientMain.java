package com.raulhoyos.creational.builder;

public class ClientMain {
    public static void main(String[] args) {
        PizzaDirector director = new PizzaDirector();
        
        AmericanPizzaBuilder americanBuilder = new AmericanPizzaBuilder();
        director.constructAmericanPizza(americanBuilder);
        Pizza p1 = americanBuilder.getResult();
        System.out.println("American Pizza:" + p1.toString());

        System.out.println("-------------------------------------------------");

        ItalianPizzaBuilder italinBuilder = new ItalianPizzaBuilder();
        director.constructItalianPizza(italinBuilder);
        Pizza p2 = italinBuilder.getResult();
        System.out.println("Italian Pizza:" + p2.toString());

        System.out.println("-------------------------------------------------");

        VegetarianPizzaBuilder vegetarianBuilder = new VegetarianPizzaBuilder();
        director.constructVegetarianPizza(vegetarianBuilder);
        Pizza p3 = vegetarianBuilder.getResult();
        System.out.println("Vegetarian Pizza:" + p3.toString());


        
        
        
    }
}
