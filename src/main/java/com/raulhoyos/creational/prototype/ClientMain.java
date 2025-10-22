package com.raulhoyos.creational.prototype;

public class ClientMain {
    public static void main(String[] args) {
        
        CreatureRegistry registry = new CreatureRegistry();

        System.out.println("Available prototypes:\n" + registry.listPrototypes());

        //Clone prototype
        MagicalCreature dragon1 = registry.get("FireDragon");
        MagicalCreature dragon2 = registry.get("FireDragon");


        System.out.println("\nAre the same dragon d1 & d2?");
        System.out.println( dragon1 == dragon2); // false

        System.out.println("\nAre clones and independients dragons?");
        System.out.println(dragon1.equals(dragon2)); // true

        Golem newGolem = new Golem("MudGolem", Element.EARTH, 50, "Mud", 120, 150);
        registry.addPrototype("MudGolem", newGolem);

        System.out.println("\nList adding new Prototype:");
        System.out.println(registry.listPrototypes());
    }
}
