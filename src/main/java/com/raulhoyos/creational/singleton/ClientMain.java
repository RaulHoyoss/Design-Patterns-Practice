package com.raulhoyos.creational.singleton;

public class ClientMain {
    
    public static void main(String[] args) {


        System.out.println("=== Test 1: Basic singleton ===");
        DroneControlCenter c1 = DroneControlCenter.getInstance();
        DroneControlCenter c2 = DroneControlCenter.getInstance();

        System.out.println("Hava c1 & c2 same instance? " + (c1 == c2));
        System.out.println("HashCode c1: " + c1.hashCode());
        System.out.println("HashCode c2: " + c2.hashCode());


        System.out.println("\n=== Test 2: Basic singleton ===");
        Drone d1 = new Drone(1);
        Drone d2 = new Drone(2);
        Drone d3 = new Drone(3);

        d1.connect();
        d2.connect();
        d3.connect();

        c1.showActiveDrones();
        c1.sendCommand("Return to base");

        
        System.out.println("\n=== Test 3: Thread-safe test ===");
        Runnable task = () -> {
            DroneControlCenter center = DroneControlCenter.getInstance();
            System.out.println(Thread.currentThread().getName() + " -> " + center.hashCode());
        };

        
        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(task, "DroneThread-" + i);
            t.start();
        }

    }
}
