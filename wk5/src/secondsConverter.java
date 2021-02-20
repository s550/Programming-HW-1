import java.util.Scanner;

public class secondsConverter {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter number of seconds");
        int seconds = keyboard.nextInt();

        if(seconds < 60){
            System.out.println(seconds + " second(s)");
        }
        else if(seconds >= 60 && seconds <= 3599){

            if(seconds == 60){
                System.out.println("1 minute(s)");
            }
            else {
                // check if seconds are zero then only list minutes,
                if((seconds % 60)  == 0){
                    System.out.println(((seconds % 3600) / 60) + " minute(s)");
                }
                else {
                    System.out.println(((seconds % 3600) / 60) + " minute(s)");
                    System.out.println((seconds % 60) + " second(s)");
                }
            }
        }
        else if(seconds >= 3600 && seconds <= 86399){
            if(seconds == 3600){
                System.out.println("1 hour(s)");
            }
            else{
                System.out.println((seconds / 3600) + " hour(s)");
                System.out.println(((seconds % 3600) / 60) + " minute(s)");
                System.out.println((seconds % 60) + " second(s)");
            }
        }
        else if(seconds >= 86400){
            if(seconds == 86400){
                System.out.println("1 day(s)");
            }
            else{
                // check if hours are zero then only list days, minutes, and seconds
                if((seconds % 86400) / 3600 == 0){
                    System.out.println((seconds / 86400) + " day(s)");
                    System.out.println(((seconds % 3600) / 60) + " minute(s)");
                    System.out.println((seconds % 60) + " second(s)");
                }
//                check if minutes are zero then only list days hours and seconds.
                else if((seconds % 3600) / 60 == 0){
                    System.out.println((seconds / 86400) + " day(s)");
                    System.out.println(((seconds % 86400) / 3600) + " hour(s)");
                    System.out.println((seconds % 60) + " second(s)");
                }
                else {
                    System.out.println((seconds / 86400) + " day(s)");
                    System.out.println(((seconds % 86400) / 3600) + " hour(s)");
                    System.out.println(((seconds % 3600) / 60) + " minute(s)");
                    System.out.println((seconds % 60) + " second(s)");
                }
            }
        }
        else{

        }

    }
}
