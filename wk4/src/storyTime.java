import java.util.Scanner;

public class storyTime {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Enter a name");
        String name = keyboard.nextLine();

        System.out.println("Enter an age");
        int age = keyboard.nextInt();
        keyboard.nextLine();

        System.out.println("Enter a city");
        String city = keyboard.nextLine();

        System.out.println("Enter the name of a college");
        String college = keyboard.nextLine();

        System.out.println("Enter a profession");
        String profession = keyboard.nextLine();

        System.out.println("Enter an animal");
        String pet = keyboard.nextLine();

        System.out.println("Enter a pet name");
        String petName = keyboard.nextLine();

        System.out.println("Here's your story");
        System.out.println("There was once someone named " + name + " who lived in " + city + ".\n"
                + "At the age of " + age + ", " + name + " went to college at " + college + ".\n"
        + "After 4 years, " + name + " was " + (age + 4) +".\n"
        + name + " then graduated and went to work as a " + profession + ".\n"
        + "Then, " + name + " adopted a(n) " + pet + " named " + petName +".\n"
        + "They both lived happily ever after!");
    }
}
