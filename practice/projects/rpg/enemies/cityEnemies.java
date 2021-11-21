package practice.projects.rpg.enemies;

public class cityEnemies extends buildEnemy{
   
    String cName;
    int cStrength; 
    int cHealth;
    String cAbilities;
    String cGimic;

    public void salesMan() {

        this.cName = "Sales Man"; 
        this.cStrength = 3; 
        this.cHealth = 20; 
        this.cAbilities = "MAGIC";
        this.cGimic = "GOOD ON THE PHONE";

    }

    public void rat() {

        this.cName = "Rat";
        this.cStrength = 2;
        this.cHealth = 19;
        this.cAbilities = "MELEE";
        this.cGimic = "A SERIOUS BITE";

    }

    public void bird() {

        this.cName = "Bird";
        this.cStrength = 4; 
        this.cHealth = 18;
        this.cAbilities = "RANGE COMBAT";
        this.cGimic = "YOU ALREADY KNOW"; 

    }
 



}
