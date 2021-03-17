import java.util.Scanner;

public class testSolution {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("enter amount of coffees.");

        int testDollar = keyboard.nextInt();
        int testStar = 0;
        int freeCoffee = 0;


        for(int i = 0; i < testDollar; i++){
            testStar += 1;
            if(testStar % 7 == 0){
                System.out.println("multiple of 7");
                testStar = 1;
                freeCoffee += 1;


            }

        }

        System.out.println("Stars:" + testStar);
        System.out.println("Coffees:" + (testDollar + freeCoffee));




    }
}
