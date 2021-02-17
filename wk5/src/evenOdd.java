import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int number = keyboard.nextInt();

        if(number % 2 == 0 ){
            System.out.println(number + " is even.");
        }
        else{
            System.out.println(number + " is odd.");
        }
    }
}
