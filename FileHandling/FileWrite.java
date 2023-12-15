package FileHandling;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class FileWrite {
    public static void main(String[] args) throws IOException {
        // write1("C:\\Users\\Sanja\\Documents\\JAVA\\Sample.txt");
        // write2("C:\\Users\\Sanja\\Documents\\JAVA\\Sample.txt");
        // write3("C:\\Users\\Sanja\\Documents\\JAVA\\Sample.txt");
        // write4("C:\\Users\\Sanja\\Documents\\JAVA\\Sample.txt");
        // write5("C:\\Users\\Sanja\\Documents\\JAVA\\Sample.txt");
        write0();
    }
    /*This below writeString() method passes two parameters path of the file and content for the file to write
     * to display the content wrote is displayed using the readString method in the Files class
    */
    static void write0() throws IOException{
        Path path=Path.of("C:\\Users\\Sanja\\Documents\\JAVA\\Sample.txt");
        Files.writeString(path, "This is the writeString method in the Files class");
        String fileContent=Files.readString(path);
        System.out.println(fileContent);
    }
    static void write1(String path) throws IOException{
        FileWriter writer=new FileWriter(path);
        writer.write("Hello this is the FileWriter example.");
        writer.close();

    }
    static void write2(String str) throws IOException{
        BufferedWriter writer=new BufferedWriter(new FileWriter(str));
        writer.write("Hello, this is a BufferedWriter example.");
        writer.close();
    }
    static void write3(String str) throws IOException{
        PrintWriter writer=new PrintWriter(new FileWriter(str));
        writer.write("Hello, this is a PeintWriter example");
        writer.close();
    }
    static void write4(String str) throws IOException{
        Files.write(Paths.get(str), Arrays.asList("Hello, Files.write!","Another Line") );
    }
    static void write5(String str) throws IOException{
        FileOutputStream fos=new FileOutputStream(str);
        byte[]data=new byte[101];
        for(int i=0;i<data.length;i++)
            data[i]=(byte)i;
        fos.write(data);
        fos.close();
    }
}
