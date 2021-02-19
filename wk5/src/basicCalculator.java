import java.util.Scanner;

public class basicCalculator {
    public static void main(String[] args){
//        make an if statement that validates if add subtract divide or multiply is true then print operation
        Scanner keyboard = new Scanner(System.in);
        double result = 0.0;
        System.out.println("Enter first number");
        double firstNum = keyboard.nextDouble();

        System.out.println("Enter second number");
        double secondNum = keyboard.nextDouble();

        System.out.println("Enter a menu option");
        System.out.println("[1] Add\n" +
                "[2] Subtract\n" +
                "[3] Multiply\n" +
                "[4] Divide");
        int choice = keyboard.nextInt();

        if(choice >= 5 || choice < 1){
            System.out.println("Invalid menu option");
        }
        else if(choice == 1){
            result = firstNum + secondNum;
            System.out.printf("%.1f + %.1f = %.1f\n", firstNum, secondNum, result);
        }
        else if(choice == 2){
            result = firstNum - secondNum;
            System.out.printf("%.1f - %.1f = %.1f\n", firstNum, secondNum, result);
        }
        else if(choice == 3){
            result = firstNum * secondNum;
            System.out.printf("%.1f * %.1f = %.1f\n", firstNum, secondNum, result);
        }
        else if(choice == 4){
            if(secondNum == 0){
                System.out.println("If division is selected the second number cannot be zero");
            }
            else{
                result = firstNum / secondNum;
                System.out.printf("%.1f / %.1f = %.1f\n", firstNum, secondNum, result);
            }
        }
        else {

        }
    }
}
