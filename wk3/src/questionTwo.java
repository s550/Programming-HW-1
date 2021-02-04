import java.util.Scanner;

public class questionTwo {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter an integer");
        double decimal = keyboard.nextDouble();
        System.out.println(decimal + " + 1.0 = " +(decimal + 1.0));
    }
}
