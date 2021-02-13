import java.util.Scanner;

public class firstnLast {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter some text");
        String phrase = keyboard.nextLine();

        System.out.println("You entered: " + phrase);
        System.out.println("First letter: " + phrase.charAt(0));
        System.out.println("Last letter: " + phrase.charAt(phrase.length() - 1));
    }
}
