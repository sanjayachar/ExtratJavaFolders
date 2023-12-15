package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReadBufferRead {
    public static void main(String[] args) throws IOException {
        File file=new File("C:\\Users\\Sanja\\Documents\\JAVA\\IBMCoding\\DecimalToBinary.java");

        BufferedReader br=new BufferedReader(new FileReader(file));

        String st;
        while((st=br.readLine())!=null){
            System.out.println(st);
        }
    }
}
