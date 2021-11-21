package practice.projects.rpg.enemies;

public class townEnemy {
    
    String tName;
    int tStrength;
    int tHealth;
    String tAbilities;
    String tGimic;


    public void strayDog() {

        this.tName = "Stray Dog";
        this.tStrength = 4;
        this.tHealth = 19;
        this.tAbilities = "MELEE"; 
        this.tGimic = "K9's"; 

    }

    public void biker() {

        this.tName = "Biker";
        this.tStrength = 4; 
        this.tHealth = 21;
        this.tAbilities = "RANGE COMBAT";
        this.tGimic = "FUMES OF SMOKE POUR OUT THE EXHAUST";

    }

    public void police() {

        this.tName = "Police";
        this.tStrength = 5;
        this.tHealth = 21;
        this.tAbilities = "MAGIC";
        this.tGimic = "HOW...";
    }
}
