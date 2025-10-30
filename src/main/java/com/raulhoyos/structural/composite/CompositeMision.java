package com.raulhoyos.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeMision implements MisionComponent {
    
    List<MisionComponent> misions = new ArrayList<>();
    private String name;

    public CompositeMision(String name){
        this.name = name;
    }

    public void add(MisionComponent m){
        if(!misions.contains(m)){
            misions.add(m);
        }
        else{
            System.out.println("This mission is already underway");
        }
    }

    public void delete(MisionComponent m){
        misions.remove(m);
    }

    @Override
    public void showDetails() {
        showDetails(0); // nivel 0 para la raíz
    }

    private void showDetails(int level) {
    String indent = "  ".repeat(level); // 2 espacios por nivel
    System.out.println(indent + "Composite mision: " + name);

    for (MisionComponent m : misions) {
        if (m instanceof CompositeMision) {
            ((CompositeMision) m).showDetails(level + 1);
        } else {
            System.out.print(indent + "  ");
            m.showDetails();
        }
    }
}

    @Override
    public int calculateReward(){

        int result = 0;
        for (MisionComponent m : misions){
            result += m.calculateReward();
        }

        return result;
    }

}
