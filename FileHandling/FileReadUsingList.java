package FileHandling;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileReadUsingList {
    public static void main(String[] args) throws IOException {
        String filePath="C:\\Users\\Sanja\\Documents\\JAVA\\IBMCoding\\FibonacciTraingle.java";

        List<String>lines=Files.readAllLines(Paths.get(filePath));
        for(String line:lines)
            System.out.println(line);
    }
}
