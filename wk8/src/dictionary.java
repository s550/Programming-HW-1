import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class dictionary {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner keyboard = new Scanner(System.in);
//        System.out.println("Enter word to spellcheck (or exit to end)");
        String word = "";

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
                        System.out.println(line);
                    }
//                    else if(word.compareTo(line) != 0){
//                        System.out.println("word misspelled.");
//                    }
//                    else if(line.compareTo(word) != 0){
//                        System.out.println("triggered");
//                        line = inputFile.nextLine();
//                    }
//                    if (line.compareToIgnoreCase(word) == 0){
//                        System.out.println(word + " is spelled correctly.");
//                    }else{
//                        System.out.println(word + " is not spelled correctly.");
//                    }



                }
            }
        }
    }

