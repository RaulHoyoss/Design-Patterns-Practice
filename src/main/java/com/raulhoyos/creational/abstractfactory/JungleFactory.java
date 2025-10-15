package com.raulhoyos.creational.abstractfactory;

public class JungleFactory implements AnimalFactory {
     public Herbivore createHerbivore(){
        return new Deer();
    }

    public Carnivore createCarnivore(){
        return new Lion();
    }
}
