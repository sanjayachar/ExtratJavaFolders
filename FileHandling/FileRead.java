package FileHandling;

import java.io.FileReader;

public class FileRead {
    public static void main(String[] args) throws Exception {
        FileReader fr=new FileReader("C:\\Users\\Sanja\\Documents\\JAVA\\IBMCoding\\HCF.java");
        int i=0;
        while((i=fr.read())!=-1){
            System.out.print((char)i);
        }
    }
}
