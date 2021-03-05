import java.util.Scanner;

public class checkForZero {

    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter zero to exit:");
        int choice = keyboard.nextInt();

        while(choice != 0){
            System.out.println("Enter zero to exit:");
            choice = keyboard.nextInt();
        }
    }
}
