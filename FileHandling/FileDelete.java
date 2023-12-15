package FileHandling;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileDelete {
    public static void main(String[] args) throws IOException {
        File file=new File("C:\\Users\\Sanja\\Documents\\JAVA\\NewFileName.java");
        file.delete();

        Files.deleteIfExists(Paths.get("C:\\Users\\Sanja\\Documents\\JAVA\\IBMCodingFileHandling.java"));
        BufferedInputStream bf;
    }
}
