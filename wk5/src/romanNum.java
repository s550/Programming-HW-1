import java.util.Scanner;

public class romanNum {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10");
        int number = keyboard.nextInt();
        String one = "I";
        String five = "V";
        String ten = "X";
        String concat = (one + one);

        if(number >= 1 && number <= 10) {
            switch (number) {
                case 1:
                    System.out.println("I");
                    break;
                case 2:
                    System.out.println("II");
                    break;
                case 3:
                    System.out.println("III");
                    break;
                case 4:
                    System.out.println("IV");
                    break;
                case 5:
                    System.out.println("V");
                    break;
                case 6:
                    System.out.println("VI");
                    break;
                case 7:
                    System.out.println("VII");
                    break;
                case 8:
                    System.out.println("VIII");
                     break;
                case 9:
                    System.out.println("IX");
                    break;
                case 10:
                    System.out.println("X");
                default:
            }
        }
        else{
            System.out.println("That's not between 1 and 10");

        }
    }
}
