package com.raulhoyos.creational.abstractfactory;

public class ClienMain {
    public static void main(String[] args) {
        
        
        System.out.println("--- Jungle animals ----");
        runSimulation(new JungleFactory());
        
        System.out.println("--- Farm animals ----");
        runSimulation(new FarmFactory());

    }

    static void runSimulation(AnimalFactory factory) {
        Herbivore h = factory.createHerbivore();
        Carnivore c = factory.createCarnivore();
        h.eatPlants();
        c.eatMeal();
    }

}
