import java.util.Scanner;

public class directionalLoop {
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        int direction = 1;

        while(direction != 0){
            System.out.println("Which direction would you like to move?");
            System.out.println("[8] North\n" + "[4] West\n" + "[2] South\n" + "[6] East\n" + "[0] Exit");
            direction = keyboard.nextInt();

            if(direction == 8){
                System.out.println("You moved north.");
            }
            else if(direction == 4){
                System.out.println("You moved west.");
            }
            else if(direction == 2){
                System.out.println("You moved south.");
            }
            else if(direction == 6){
                System.out.println("You moved east.");
            }
        }
    }
}
