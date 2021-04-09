import java.util.Scanner;

public class scoreChecker {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);

        int testsTaken = 1;
        double testScore = 1.0;

        System.out.println("Enter name");
        String userName = keyboard.nextLine();

        TestScores user = new TestScores(userName);

        while (testScore >= 0){
            System.out.println("Enter score " + testsTaken + " or a negative number to exit");
            testScore = keyboard.nextDouble();
            if (testScore >= 0) {
                user.addTestScore(testScore);
            }
            testsTaken++;


        }

     System.out.println("-- " + userName + " --");
     System.out.println("Num tests taken: " + user.getNumTestsTaken());
     System.out.printf("Average: %.1f\n",user.getAverage());
    }
}
