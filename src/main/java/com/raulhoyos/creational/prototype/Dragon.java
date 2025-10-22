package com.raulhoyos.creational.prototype;

import java.util.Objects;

public class Dragon extends MagicalCreature {
    
    public double wingSpan;
    public String breathType;
    public String scaleColor;

    public Dragon(String name, Element element, int powerLevel,
                    double wingSpan, String breathType, String scaleColor){
                     super( name, element, powerLevel);
                     this.wingSpan = wingSpan;
                     this.breathType = breathType;
                     this.scaleColor = scaleColor;   
    }

    public Dragon(Dragon target){
        super(target);
        if(target != null){
            this.name = target.name;
            this.element = target.element;
            this.powerLevel = target.powerLevel;
            this.wingSpan = target.wingSpan;
            this.breathType = target.breathType;
            this.scaleColor = target.scaleColor;
        }
    }

    @Override 
    public MagicalCreature clone(){
        return new Dragon(this);
    }

    @Override
    public boolean equals(Object object2){
        if (!(object2 instanceof Dragon)) return false;
        if (!super.equals(object2)) return false;

        Dragon dragon2 = (Dragon) object2;
        return Double.compare(wingSpan, dragon2.wingSpan) == 0
        && Objects.equals(breathType, dragon2.breathType)
        && Objects.equals(scaleColor, dragon2.scaleColor);
    }


}
