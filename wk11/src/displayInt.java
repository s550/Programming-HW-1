import java.util.Scanner;

public class displayInt {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("How many integers do you have? (Max 20)");

        int ints = keyboard.nextInt();
        int[] arr = new int [ints];

        for(int i = 0; i < arr.length; i++){
            System.out.println("Enter element for subscript " + i);
            arr[i] = keyboard.nextInt();
        }
        System.out.println("Here are all of those numbers");
        for(int z = 0; z < arr.length; z++){
            System.out.println(arr[z]);
        }
    }
}
