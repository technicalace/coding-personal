package practice;

public class comodity {
    public static void main(String[] args) {
        String command = "BUY";
        int balance = 550;
        int quantity = 42;

        switch(command) {
            case "BUY": 
                quantity += 5;
                balance -= 20;
                break;
            case "SELL":
                quantity -= 5;
                balance += 5;
        }
        System.out.println("Balance: $" + balance + "\n" + "Quantity: " + quantity);
    }
}
