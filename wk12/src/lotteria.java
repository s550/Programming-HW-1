import java.util.Scanner;

public class lotteria {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        int[] winners = {8,13,27,53,54};
        int[] numbers = new int[5];
        int counter = 0;
        int correctNumbers = 0;


        System.out.println("Check your lottery numbers here!");

        while(counter < numbers.length){
            System.out.println("Enter number " + (counter + 1) + ":");
            int number = keyboard.nextInt();

            if(number < 1 || number > 99){
                System.out.println("Must be between 1 and 99");
            }
            else{
                numbers[counter] = number;
                counter++;
            }
        };

        for(int i = 0; i < numbers.length; i++){

            for(int z = 0;z < winners.length; z++){
                if(numbers[i] == winners[z]){
                    correctNumbers++;
            }
            }


        }
        System.out.println("All set. The winning numbers were: 8 13 27 53 54");
        if(correctNumbers == 5){
            System.out.println("WOW! Grand prize winner!");
        }
        else {
            System.out.println("Well, you didn't win. You got " + correctNumbers + " matching number(s)");
        }
    }
}
