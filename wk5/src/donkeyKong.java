import java.util.Scanner;

public class donkeyKong {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int oneUp = 7000;

        System.out.println("Enter your score:");
        int score = keyboard.nextInt();



        if(score < 7000 && score >= 0){
            System.out.print("You need " + (7000 - score) + " more points for a 1UP");
        }
        else if(score >= 7000) {
            System.out.print("1UP");
        }
        else{
            System.out.print("You got less than zero?  This score is invalid.");
        }
    }
}