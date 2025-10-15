package com.raulhoyos.creational.abstractfactory;

public class FarmFactory implements AnimalFactory {
    public Herbivore createHerbivore(){
        return new Cow();
    }

    public Carnivore createCarnivore(){
        return new Wolf();
    }
}
