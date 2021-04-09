import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileStats {
    private String filename;

    public FileStats(String f){
        filename = f;
    }

    public int getNumLines() throws FileNotFoundException {
//        make a variable to hold the file name
        File fileObj = new File(filename);
//        open the file
        Scanner inputFile = new Scanner(fileObj);
//        keep track of the number of lines
        int numLines = 0;
//      while there are still lines to read, read a line
        while(inputFile.hasNext()){
            String line = inputFile.nextLine();
//            keep track of lines read
            numLines++;
        }
        inputFile.close();
        return numLines;
    }

    public int getNumLinesThatContain(String key) throws FileNotFoundException {
//        make a variable to hold the file name
        File fileObj = new File(filename);
//        open the file
        Scanner inputFile = new Scanner(fileObj);
//        keep track of the number of lines
        int numLines = 0;
//      while there are still lines to read, read a line
        while(inputFile.hasNext()){
            String line = inputFile.nextLine();
            if(line.toLowerCase().contains(key.toLowerCase())){
                numLines++;
            }
//            keep track of lines read

        }
        inputFile.close();
        return numLines;
    }
}
