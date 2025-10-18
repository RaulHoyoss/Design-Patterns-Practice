package com.raulhoyos.creational.builder;



import com.raulhoyos.creational.builder.enums.Dough;
import com.raulhoyos.creational.builder.enums.Sauce;
import com.raulhoyos.creational.builder.enums.Size;

public interface PizzaBuilder {
    void setSize(Size size);
    void setDough(Dough dough);
    void setSauce(Sauce sauce);
    void addIngredient(String ingredient);
    void setStuffedCrust(boolean crust);
    Pizza getResult();

}
