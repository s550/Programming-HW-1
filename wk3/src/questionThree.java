import java.util.Scanner;

public class questionThree {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter an integer");
        int number = keyboard.nextInt();
        System.out.print(number + " mod 2 = " +(number % 2));
    }
}
