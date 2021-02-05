import java.util.Scanner;

public class questionFour {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter base and height separated by a space");
        double first = keyboard.nextDouble();
        double second = keyboard.nextDouble();
        double area = first * second;
        System.out.println("Area: " + (area * 0.5));
    }
}
