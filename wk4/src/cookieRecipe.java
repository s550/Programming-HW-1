import java.util.Scanner;

public class cookieRecipe {
    public static void main(String[] args){
        final double SUGAR = 1.5;
        final double BUTTER = 1.0;
        final double FLOUR = 2.75;
        final int BATCH = 48;

        Scanner keyboard = new Scanner(System.in);

        System.out.println("How many batches of cookies do you want?");
        int cookiesWanted = keyboard.nextInt();
        System.out.println(cookiesWanted + " batches? That's " + (cookiesWanted * BATCH) + " cookies.");

        System.out.println("Alright, here is what you need");
        System.out.println((SUGAR * cookiesWanted) + " cups of sugar");
        System.out.println((BUTTER * cookiesWanted) + " cup of butter");
        System.out.println((FLOUR * cookiesWanted) + " cups of flour");

    }
}
