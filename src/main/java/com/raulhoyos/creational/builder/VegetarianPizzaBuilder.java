package com.raulhoyos.creational.builder;

import java.util.ArrayList;
import java.util.List;

import com.raulhoyos.creational.builder.enums.Dough;
import com.raulhoyos.creational.builder.enums.Sauce;
import com.raulhoyos.creational.builder.enums.Size;

public class VegetarianPizzaBuilder implements PizzaBuilder {
    
    private  Size size;
    private  Dough dough;
    private  Sauce sauce;
    private List<String> ingredients = new ArrayList<>();
    private  boolean stuffedCrust;

    

    
    @Override
    public void setSize(Size size){
        this.size =  size;
    }

    @Override
    public void setDough(Dough dough){
        this.dough = dough;
    }

    @Override
    public void setSauce(Sauce sauce){
        this.sauce = sauce;
    }


    @Override
    public void addIngredient(String ingredient){
        this.ingredients.add(ingredient);
    }

    @Override
    public void setStuffedCrust(boolean crust){
       this.stuffedCrust = crust;
    }

    @Override
    public  Pizza getResult(){
        return new Pizza(size, dough, sauce, ingredients,stuffedCrust );
    }
    
}
