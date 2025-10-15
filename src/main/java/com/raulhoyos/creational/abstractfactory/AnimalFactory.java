package com.raulhoyos.creational.abstractfactory;

public interface AnimalFactory {
    Herbivore createHerbivore();
    Carnivore createCarnivore();
}
