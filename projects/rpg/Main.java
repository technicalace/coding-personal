package projects.rpg;

import projects.rpg.characterSelection;
import java.util.Scanner;
import javax.swing.plaf.synth.SynthScrollBarUI; 


public class Main {    
    public static void main(String[] args) {
        
        String textInput;
        int numInput; 

        Scanner sc = new Scanner(System.in);
        
        characterSelection csObject = new characterSelection();

        // introduction
        System.out.println("What character class would you like to choose?");
        System.out.println("Type the letter that corresponds with the class");
        System.out.println("Knight = (K)\nMage = (M)\nArcher = (A) ");
        textInput = sc.nextLine(); 

        switch (textInput) {
            case "K": 
                System.out.println("You are a Knight:\n---------- ");
                csObject.knightClass();
                break; 
            case "M":
                System.out.println("You are a Mage:\n----------");
                csObject.mageClass();
                break;
            case "A": 
                System.out.println("You are a archer:\n----------");
                csObject.archerClass();
                break;
            default: 
                System.out.println("Invalid input, please try again.");
                
        }


        


    }
}
