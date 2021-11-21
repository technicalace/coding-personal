package practice;

public class grading {
    public static void main(String[] args) {
        int grade = 75;
        char letterGrade;

        if (grade > 89) {
            letterGrade = 'A';
        }else if (grade > 79) {
            letterGrade = 'B';
        }else if (grade > 69) {
            letterGrade = 'C';
        }else if (grade > 59) {
            letterGrade = 'D';
        }else {
            letterGrade = 'F';
        }

        switch (letterGrade) {
            case 'A': 
                System.out.println("Great job, you've got an A");
                break;
            case 'B': 
                System.out.println("Good job you got a B");
                break;
            case 'C': 
                System.out.println("Nice you got a C");
                break;
            case 'D': 
                System.out.println("You got a D");
                break;
            case 'F': 
                System.out.println("F...");
                break;
        }
    }
}
