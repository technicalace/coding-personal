package practice;

public class spaceRemover {
    public static void main(String[] args) {
        String mostFamous = "Rudolph the Red Nosed Raindeer";
        char[] mf1 = mostFamous.toCharArray();
        for (int dex = 0; dex < mf1.length; dex++) {
            char current = mf1[dex];
            if (current != ' ') {
                System.out.println(current);
            } else {
                System.out.println('.');
            }
        }
        
    }
}
