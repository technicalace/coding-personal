package practice;

public class planetWeight {
    public static void main(String[] args) {
        System.out.print("Your weight on Earth is ");
        double weight = 178;
        System.out.println(weight);

        System.out.print("Your weight on Mercury is ");
        double mercury = weight * .378;
        System.out.println(mercury);

        System.out.print("Your weight on the moon is ");
        double moon = weight * .166;
        System.out.println(moon);
        
        System.out.print("Your weight on Jupitar is ");
        double jupitar = weight * 2.364;
        System.out.println(jupitar);

        System.out.println("Your weight on Venus is " );
        double venus = weight * 90.7;
        System.out.println(venus);

        System.out.println("Your weight on Uranus is ");
        double uranus = weight * 88.9;
        System.out.println(uranus);
    }
}
