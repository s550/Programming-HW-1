import java.util.Scanner;
public class questionFive {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter first number");
        int firstNum = keyboard.nextInt();
        System.out.println("Enter second number");
        int secondNum = keyboard.nextInt();
        int stableNum = secondNum;

        System.out.println(firstNum + " + " + secondNum + " = " + (firstNum + secondNum));
        secondNum += stableNum;

        System.out.println(firstNum + " + " + secondNum + " = " + (firstNum + secondNum));
        secondNum += stableNum;

        System.out.println(firstNum + " + " + secondNum + " = " + (firstNum + secondNum));
        secondNum += stableNum;

        System.out.println(firstNum + " + " + secondNum + " = " + (firstNum + secondNum));
        secondNum += stableNum;

        System.out.println(firstNum + " + " + secondNum + " = " + (firstNum + secondNum));
        secondNum += stableNum;







    }
}
