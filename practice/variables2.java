package practice;

public class variables2 {
    public static void main(String[] args) {
        int tops;
        float gradePointAverage;
        char key = 'C';
        String productName = "Larvets";
        double pi = 3.14;
        
        System.out.println("-------------------");
        //addition 
        double weight = 205; 
        weight = weight + 10;

        System.out.println("-------------------");
        //subtraction
        weight = weight - 15;

        System.out.println("-------------------");
        //division 
        weight = weight / 3;
        int remainder = 245 % 3;

        System.out.println("-------------------");
        // prefixed increment
        int x = 3;
        int answer = ++x *10;
        System.out.println(answer);

        System.out.println("-------------------");
        // postfixed increment
        int answer2 =  x * 10;
        x++;
        System.out.println(answer2);
    }
}
