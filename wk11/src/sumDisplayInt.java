import java.util.Scanner;

public class sumDisplayInt {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("How many integers do you have? (Max 20)");
        int ints = keyboard.nextInt();
        int sum = 0;

        if (ints < 1 || ints > 20) {
            System.out.println("You must enter a number in between 1 and 20");
        } else {
            int[] arr = new int[ints];

            for (int i = 0; i < arr.length; i++) {
                System.out.println("Enter element for subscript " + i);
                arr[i] = keyboard.nextInt();
            }
            System.out.println("Here are all of those numbers");
            for (int z = 0; z < arr.length; z++) {
                sum += arr[z];
                System.out.println(arr[z]);
            }
            System.out.println("The sum of these numbers is " + sum);
        }
    }

}