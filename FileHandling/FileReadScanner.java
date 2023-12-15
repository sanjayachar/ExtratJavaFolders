package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadScanner {
    public static void main(String[] args) throws FileNotFoundException {
        File file=new File("C:\\Users\\Sanja\\Documents\\JAVA\\IBMCoding\\HCF.java");
        Scanner sc=new Scanner(file);
        while(sc.hasNextLine())
            System.out.println(sc.nextLine());
    }
}
