package com.raulhoyos.creational.builder;

import java.util.List;

import com.raulhoyos.creational.builder.enums.Dough;
import com.raulhoyos.creational.builder.enums.Sauce;
import com.raulhoyos.creational.builder.enums.Size;

public class Pizza {
    private final Size size;
    private final Dough dough;
    private final Sauce sauce;
    private final List<String> ingredients;
    private final boolean stuffedCrust;


    public Pizza(Size size, Dough dough, Sauce sauce, List<String> ingredients,boolean stuffedCrust  ){
        this.size = size;
        this.dough = dough;
        this.sauce = sauce;
        this.ingredients = ingredients;
        this.stuffedCrust = stuffedCrust;

    }

     public Size getSize() { return size; }
     public Dough getDough() { return dough; }
     public Sauce getSauce() { return sauce; }
     public List<String> getIngredients() { return ingredients; }
     public boolean hasStuffedCrust() { return stuffedCrust ; }

     @Override
     public String toString(){
        return "{size=" + size + ", dough=" + dough + ", sauce=" + sauce
        + ", ingredients=" + ingredients + ", stuffedCrust=" + stuffedCrust + "}";
     }
}



