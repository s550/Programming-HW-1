import java.util.Scanner;

public class interestCalc {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("== One Year Interest Calculator ==");

        System.out.println("How much money do you have?");
        double moneySaved = keyboard.nextDouble();

        System.out.println("What's the interest rate?");
        double interestRate = keyboard.nextDouble();

        double interestAccumulated = (interestRate / 100.0) * moneySaved;
        double total = moneySaved + interestAccumulated;

        System.out.println("Interest earned: $" + interestAccumulated );
        System.out.println("New balance: $" +(total));
    }
}
