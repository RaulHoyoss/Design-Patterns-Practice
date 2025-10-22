package com.raulhoyos.creational.prototype;

import java.util.Objects;

public abstract class MagicalCreature implements Prototype {
    public String name;
    public Element element;
    public int powerLevel;

    public MagicalCreature( String name, Element element, int powerLevel){
        this.name = name;
        this.element = element;
        this.powerLevel = powerLevel;

    }

    public MagicalCreature(MagicalCreature source){
        this.name = source.name;
        this.element = source.element;
        this.powerLevel = source.powerLevel;
    }

    public abstract MagicalCreature clone();

    public boolean equals(Object object2){
        if (!(object2 instanceof MagicalCreature)) return false;
        MagicalCreature creature2 = (MagicalCreature) object2;
        return powerLevel == creature2.powerLevel
            && Objects.equals(name, creature2.name)
            && element == creature2.element;
        }

}
