package com.raulhoyos.creational.singleton;

import java.util.ArrayList;
import java.util.List;

public class DroneControlCenter {
    
    private static volatile DroneControlCenter instance;
    private List<Drone> activeDrones;

    private DroneControlCenter(){
        activeDrones = new ArrayList<>();
        System.out.println("Drone control center initialized");
    }

    public static  DroneControlCenter getInstance(){
        
        if(instance == null){//1st checkup without block
            synchronized (DroneControlCenter.class){ //block only if is need
                if(instance == null){//2nd checkup instede block
                    instance = new DroneControlCenter();
                }
            }
        }
        
        return instance;
    }

    public void registerDrone(Drone drone){
        if(!activeDrones.contains(drone)){
            activeDrones.add(drone);
            System.out.println(drone + " registred.");
        }else{
            System.out.println(drone + " is already registered.");
        }
    }

    public void showActiveDrones(){
        
        System.out.println("Active drones: " + activeDrones.toString());
    }

    public void sendCommand(String command){
        System.out.println("Sending command: \"" + command + "\" to all drones...");
        for(Drone  drone : activeDrones){
            drone.reciveComman(command);
        }
    }

    @Override
    public int hashCode() {
        return System.identityHashCode(this);
    } 
}
