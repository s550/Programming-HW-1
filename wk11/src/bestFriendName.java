import java.util.Scanner;

public class bestFriendName {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        String[] friends = new String[5];

        System.out.print("Enter five names\n");
        for(int i = 0; i < friends.length; i++){
            System.out.println("Enter friend " + (i + 1));
            friends[i] = keyboard.nextLine();
        }

        System.out.println("Here are all of those names");
        for(int z = 0; z < friends.length; z++){
            System.out.println("Friend " + (z + 1) + " is " + friends[z]);
        }
        System.out.println("Which friend is your best friend? (Enter an integer)");
        int friendNumber = keyboard.nextInt();

        System.out.println(friends[(friendNumber - 1)] + "? Yes, " + friends[(friendNumber - 1)] + " is awesome");
    }
}
