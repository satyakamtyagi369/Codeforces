import java.util.*;
public class atmsystem {
    public static void main(String[] args) {
        Scanner hariom = new Scanner(System.in);
        Integer amount = null;
        System.out.print("Enter you ATM pin: ");
        int pin = hariom.nextInt();
        if(pin==1234){
        try {
            System.out.print("Enter amount to withdraw: ");
            amount = hariom.nextInt();

            if (amount <= 1) {
                amount = null;
            }
        } catch (NullPointerException e) {
            System.out.println("Enter the amount more than 1 rupee.");
        }
        }
    }
}
