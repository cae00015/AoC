import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;

public class FileParser {

    public ArrayList parseFile(String fileName) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(fileName));

        ArrayList<String> data = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            data.add(line);
        }

        scanner.close();

        return data;
    }
}
