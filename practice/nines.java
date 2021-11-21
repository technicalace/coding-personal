package practice;

public class nines {
    public static void main(String[] args) {
        for (int dex = 1; dex <= 200; dex++) {
            int multiple = 9 * dex;
            System.out.println(multiple + " ");
        }
        System.out.println();

        // do while 
        int limit = 10;
        int count = 1;
        do {
            System.out.println("I am allergic to long division");
            count++;
        } while (count < limit);
    }
}
