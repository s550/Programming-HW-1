import java.util.Scanner;

public class questionOne {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter an integer");
        int number = keyboard.nextInt();
//        number = number + 1;
        System.out.println(number + " + 1 = " + (number + 1));
    }
}
