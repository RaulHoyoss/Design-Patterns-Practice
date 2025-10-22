package com.raulhoyos.creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class CreatureRegistry {
    
   private Map<String, MagicalCreature> prototypes = new HashMap<>();
    
    public CreatureRegistry(){

        Dragon fireDragon = new Dragon("FireDragon",Element.FIRE , 100, 300, "fire", "Red & Orange");
        Dragon iceDragon = new Dragon("IceDragon", Element.WATER, 25, 180, "ice", "Blue & White");
        Golem stoneGolem = new Golem("StoneGolem", Element.EARTH, 30, "Stone", 100, 100);
        Golem absoluteGolem = new Golem("AbsoluteGolem", Element.ETHER, 101, null, 500, 500);

        prototypes.put("FireDragon", fireDragon);
        prototypes.put("IceDragon", iceDragon);
        prototypes.put("StoneGolem", stoneGolem);
        prototypes.put("AbsoluteGolem", absoluteGolem);
    }

    public void addPrototype(String key, MagicalCreature creature){
        
        if(!prototypes.containsKey(key))
        prototypes.put(key,creature);
        else{
            System.out.println("Key already added: " + key);
        }

    }

    public MagicalCreature get(String key){
        
        if(prototypes.containsKey(key)){
            return prototypes.get(key).clone();
        }else{
            System.out.println("Key doesnt exist");
            return null;
        }
    }

    public boolean contains(String key){
        return prototypes.containsKey(key);
    }

    public String listPrototypes(){

        if (prototypes.isEmpty()) {
            return "No prototypes available.";
        }

        StringBuilder sb = new StringBuilder();
        for(String key : prototypes.keySet()){
            sb.append(key).append("\n");
        }

        return sb.toString();
    }
    


}
