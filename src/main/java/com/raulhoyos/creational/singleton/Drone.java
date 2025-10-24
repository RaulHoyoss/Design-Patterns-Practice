package com.raulhoyos.creational.singleton;

public class Drone {
    public int ID;

    public Drone(int id){
        this.ID = id;
    }

    public void connect(){
        DroneControlCenter controlCenter = DroneControlCenter.getInstance();
        controlCenter.registerDrone(this);
        System.out.println("Drone " + ID + " connected to control center.");

    }

    public int getID() {
        return ID;
    }

    public void reciveComman(String command){
        System.out.println("Drone " + ID + " received command: " + command);
    }

    @Override
    public String toString(){
        return "Dronne" + ID;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Drone)) return false;
        Drone other = (Drone) obj;
        return this.ID == other.ID;
    }

    
}
