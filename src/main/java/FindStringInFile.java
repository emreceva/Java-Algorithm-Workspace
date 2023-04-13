import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FindStringInFile {

    public boolean findStringInFile(String filePath, String str) throws FileNotFoundException {
        File file = new File(filePath);

        Scanner scanner = new Scanner(file);

        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            if(line.contains(str)){
                scanner.close();
                return true;
            }
        }
        scanner.close();
        return false;
    }
}
