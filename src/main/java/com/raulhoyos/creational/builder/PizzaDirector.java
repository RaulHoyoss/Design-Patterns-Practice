package com.raulhoyos.creational.builder;

import com.raulhoyos.creational.builder.enums.Dough;
import com.raulhoyos.creational.builder.enums.Sauce;
import com.raulhoyos.creational.builder.enums.Size;

public class PizzaDirector {
    
    public void constructAmericanPizza(PizzaBuilder builder){
        builder.setSize(Size.LARGE);
        builder.setDough(Dough.THICK);
        builder.setSauce(Sauce.BBQ);
        builder.addIngredient("Pepperoni");
        builder.addIngredient("Bacon");
        builder.addIngredient("Chicken");
        builder.addIngredient("Mozzarella");
        builder.addIngredient("Cheddar");
        builder.addIngredient("Onion");
        builder.setStuffedCrust(true);


    }

    public void constructItalianPizza(PizzaBuilder builder){
        builder.setSize(Size.MEDIUM);
        builder.setDough(Dough.THIN);
        builder.setSauce(Sauce.TOMATO);
        builder.addIngredient("Mozzarella");
        builder.addIngredient("Basil");
        builder.addIngredient("Cherry tomatoes");
        builder.addIngredient("Black olives");
        builder.addIngredient("Prosciutto");
        builder.addIngredient("Olive oil");
        builder.setStuffedCrust(false);
    }

    public void constructVegetarianPizza(PizzaBuilder builder){
        builder.setSize(Size.SMALL);
        builder.setDough(Dough.WHOLE_WHEAT);
        builder.setSauce(Sauce.PESTO);
        builder.addIngredient("Mozzarella");
        builder.addIngredient("Mushrooms");
        builder.addIngredient("Peppers");
        builder.addIngredient("Onion");
        builder.addIngredient("Cherry tomatoes");
        builder.addIngredient("Olive oil");
        builder.setStuffedCrust(false);
    }
}
