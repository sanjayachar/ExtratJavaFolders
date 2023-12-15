package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadWithoutLoop {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("C:\\Users\\Sanja\\Documents\\JAVA\\IBMCoding\\HCF.java");
        Scanner sc=new Scanner(file);
        sc.useDelimiter("\\Z");
        System.out.print(sc.next());
    }
}
