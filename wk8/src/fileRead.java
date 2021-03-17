import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class fileRead {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner keyboard = new Scanner(System.in);
        int listNumber = 1;
        System.out.println("Enter filename");
        String fileName = keyboard.nextLine();

        File file = new File(fileName);
//      Check for file existing has to be done before scanner.
        if (!file.exists()){
            System.out.println("File not found");
            System.exit(0);
        }

        Scanner inputFile = new Scanner(file);


        while(inputFile.hasNext()){
//            int listNumber = 1;
            String line = inputFile.nextLine();
            System.out.println(listNumber + ": " + line);

            listNumber++;
        }
        inputFile.close();



        }





    }

