package com.raulhoyos.structural.composite;

public class ClienMain {
    public static void main(String[] args) {
       MisionComponent huntWolves = new SimpleMision(
            "Hunt Wolves", "Eliminate 5 wolves near the forest entrance.", 100);

        MisionComponent collectHerbs = new SimpleMision(
            "Collect Healing Herbs", "Gather 10 herbs for the village healer.", 120
        );

        MisionComponent rescueVillager = new SimpleMision(
            "Rescue the Trapped Villager", "Find and rescue the villager trapped in the mine.", 200
        );

        MisionComponent slayDragon = new SimpleMision(
            "Slay the Dragon",  "Defeat the dragon terrorizing the kingdom.", 600
        );

        MisionComponent forgeSword = new SimpleMision(
            "Forge the Sacred Sword", "Craft a sword powerful enough to harm dragons.", 250
        );

        MisionComponent trainWithMaster = new SimpleMision(
            "Train with the Sword Master",  "Learn new combat techniques.", 180
        );

        CompositeMision earlyTasks = new CompositeMision("Early Adventures");
        earlyTasks.add(huntWolves);
        earlyTasks.add(collectHerbs);

        CompositeMision preparation = new CompositeMision("Preparation for the Final Battle");
        preparation.add(forgeSword);
        preparation.add(trainWithMaster);

        CompositeMision rescueQuest = new CompositeMision("Rescue Missions");
        rescueQuest.add(rescueVillager);
   

        CompositeMision mainCampaign = new CompositeMision("Main Campaign");
        mainCampaign.add(earlyTasks);
        mainCampaign.add(preparation);
        mainCampaign.add(rescueQuest);
        mainCampaign.add(slayDragon);

        mainCampaign.showDetails();

         System.out.println("\nTotal reward for completing the main campaign: " 
                           + mainCampaign.calculateReward() + " gold");
     }
}

