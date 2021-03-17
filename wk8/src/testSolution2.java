import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


    public class testSolution2 {
        public static void main(String[] args) throws FileNotFoundException {
            Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter word to spellcheck (or exit to end)");
            String word = keyboard.nextLine();

            File file = new File("Z:\\projects\\Fundamentals of Programming 1\\wk8\\src\\dictionary.txt");
//      Check for file existing has to be done before scanner.
            if (!file.exists()){
                System.out.println("File not found");
                System.exit(0);
            }

            Scanner inputFile = new Scanner(file);


            while(word.compareToIgnoreCase("exit") != 0){
//                Scanner keyboard = new Scanner(System.in);
                System.out.println("Enter word to spellcheck (or exit to end)");
                word = keyboard.nextLine();

                while(inputFile.hasNext()){
                    String line = inputFile.nextLine();
                    if (line.compareTo(word) == 0){
                        System.out.println("good job");
                    }
                    while(word.compareTo(line) != 0){
                        System.out.println("Wrong word");
                        System.out.println("Enter word to spellcheck (or exit to end)");
                        word = keyboard.nextLine();
                    }

//                    System.out.println(word);
                    }



                }
            }
        }




