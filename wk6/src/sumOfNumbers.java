import java.util.Scanner;

public class sumOfNumbers {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);


        System.out.println("Enter a positive, non-zero integer");
        int count = keyboard.nextInt();
        int result = 0;

        for(int i = 0; i <= count; i++){
            result  += i;

        }

        if (count >= 1){

            System.out.println("Sum of numbers from 1 to " + count + " is " + result);
        }
        else if(count == 0){

        }
        else{
            System.out.println("Hey, I said positive");
        }
    }
}
