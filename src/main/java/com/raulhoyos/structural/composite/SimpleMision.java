package com.raulhoyos.structural.composite;

public class SimpleMision implements MisionComponent {
    
    private String name;
    private String description;
    private int reward;

    public SimpleMision(String name, String description, int reward){
        this.name = name;
        this.description = description;
        this.reward = reward;
    }

    @Override
public void showDetails() {
    showDetails(0);
}

// Overloaded method with level
void showDetails(int level) {
    String indent = "  ".repeat(level); // 2 spaces per level
    System.out.println(indent + "- Simple Mission: " + name);
    System.out.println(indent + "      " + description); // add 2 extra spaces for description
    System.out.println(indent + "      reward: " + reward); // same here
}

    @Override
    public int calculateReward(){
        return reward;
    }

    @Override
    public String toString() {
        return name + " (recompensa: " + reward + ")";
    }
}
