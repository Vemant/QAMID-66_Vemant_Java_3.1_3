import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a ticket price");
        int ticket_price = in.nextInt();
        System.out.println("Your bonus is: " + ticket_price / 20 + " mile(s)");
    }
}