import java.util.Scanner;

public class coffeeShop {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("How many dollars will you spend?");
        int dollars = keyboard.nextInt();
        int stars = 0;
        int freeCoffee = 0;

        for(int i = 0; i < dollars; i++){
            stars += 1;
            if (stars % 7 == 0){
                stars = 1;
                freeCoffee += 1;
            }

      }
        System.out.println("Coffees: " + (dollars + freeCoffee));
        System.out.println("Stars remaining: " + stars);

    }
}
