import java.io.FileNotFoundException;
import java.util.Scanner;

public class checkFile {
    public static void main(String[] args) throws FileNotFoundException{
//        FileStats dictionary = new FileStats("dictionary.txt");
//        FileStats roAndJu = new FileStats("romeo-and-juliet.txt");
//        FileStats billORights = new FileStats("bill-of-rights.txt");
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a filename");
        String filesName = keyboard.nextLine();

        FileStats fileCheck = new FileStats(filesName);
        System.out.println(filesName + " has " + fileCheck.getNumLines() + " lines");

        System.out.println("Enter some text");
        String text = keyboard.nextLine();

        System.out.println(fileCheck.getNumLinesThatContain(text) + " line(s) contain \"" + text + "\"");
    }
}
