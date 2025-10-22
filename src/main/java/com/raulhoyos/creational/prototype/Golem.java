package com.raulhoyos.creational.prototype;

import java.util.Objects;

public class Golem extends MagicalCreature {
    
    public String material;
    public double height;
    public int endurance;

    public Golem(String name, Element element, int powerLevel,
             String material, double height, int endurance) {
            super( name, element, powerLevel); // el "id" lo puedes ignorar si no lo usas
            this.material = material;
            this.height = height;
            this.endurance = endurance;
        }


    public Golem (Golem target){
        super(target);
        if(target != null ){
            this.name = target.name;
            this.element = target.element;
            this.powerLevel = target.powerLevel;
            this.material = target.material;
            this.height = target.height;
            this.endurance = target.endurance;
        }
    }

    @Override
    public MagicalCreature clone(){
        return new Golem(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Golem)) return false;
        if (!super.equals(object2)) return false;

        Golem golem2 = (Golem) object2;
        return endurance == golem2.endurance
            && Double.compare(height, golem2.height) == 0
            && Objects.equals(material, golem2.material);
    }
}
