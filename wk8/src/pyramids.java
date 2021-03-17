import java.util.Scanner;

public class pyramids {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a height");
        int height = keyboard.nextInt();

        if(height < 1){
            System.out.println("Height must be at least one.");
        }
        else{
            for (int i = 0; i < height; i++){
                for(int v = 0; v < (i + 1); v++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
