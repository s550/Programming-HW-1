import java.util.Scanner;

public class timeConverter {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a time value in the following format: HH MM SS");
        int hour = keyboard.nextInt();
        int minute = keyboard.nextInt();
        int second = keyboard.nextInt();

        if(hour >= 1 && hour <= 9){
//            System.out.println(hour + ":" + minute + ":" + second + "AM");
            if((minute <= 9 && minute >= 0) && (second <= 9 && second >= 0)){
                System.out.println("0" + hour + ":0" + minute + ":0" + second + "AM");
            }
            else{
                System.out.println("0" + hour + ":" + minute + ":" + second + "AM");
            }
        }
        else if(hour >= 10 && hour <= 11){
            if((minute <= 9 && minute >= 0) && (second <= 9 && second >= 0)){
                System.out.println(hour + ":0" + minute + ":0" + second + "AM");
            }
            else{
                System.out.println(hour + ":" + minute + ":" + second + "AM");
            }
        }
        else if(hour == 12){
            if((minute <=9 && minute >=0) && (second <=9 && second >= 0)){
                System.out.println(hour + ":0" + minute + ":0" + second + "PM");
            }
            else{
                System.out.println(hour + ":" + minute + ":" + second + "PM");
            }
        }
        else if(hour >= 13 && hour <= 21){
                if((minute <=9 && minute >=0) && (second <=9 && second >=0)){
                    System.out.println("0" +(hour - 12) + ":0" + minute + ":0" + second + "PM");
                }
                else{
                    System.out.println("0" +(hour - 12) + ":" + minute + ":" + second + "PM");
                }
        }
        else if(hour == 0){
//            System.out.println("12:00:00AM");
            if((minute <=9 && minute >=0) && (second <=9 && second >=0)){
                System.out.println("12" + ":0" + minute + ":0" + second + "AM");
            }
            else{
                System.out.println("12" + ":" + minute + ":" + second + "AM");
            }
        }
        else{
            System.out.print("Hour must be between 0 and 23 inclusive.");
        }
    }
}
