import java.util.Scanner;

public class upOrDown {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        int counter = 1;

        System.out.println("Enter an ending value");
        int val = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("Count up or down?");
        String dir = keyboard.nextLine();

        while(dir.compareToIgnoreCase("up") != 0 && dir.compareToIgnoreCase("down") != 0){
            System.out.println("Count up or down?");
            dir = keyboard.nextLine();
        }

        if (dir.compareToIgnoreCase("up") == 0){
            for(int v = 1; v <= val; v++){
                System.out.printf("%5s%5s%5s\n",v,(v + 10),(v + 100));

            }
//
        }
        else if(dir.compareToIgnoreCase("down") == 0){
                for(int i = val; i > 0; i--){
                    System.out.printf("%5s%5s%5s\n",(i - (i + counter)),((i - (i + counter)) + 10),((i - (i + counter)) + 100));
                    counter++;

                }
        }

    }
}
