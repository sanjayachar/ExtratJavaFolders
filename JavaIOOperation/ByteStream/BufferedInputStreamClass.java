package ByteStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* When the BIS is created, an internal buffer array is created.
 * it is in the java.io package and also it provides bufferring for an input stream.
 * It makes performance of reading from an input stream more 
 * efficient by using a buffer to reduce the number of reads from the underlying input stream.
 * 
 * constructors:
 * BufferedInputStream(InputStream in): creates a BIS and saves its argument,
 * the input stream in, for later use.
 * 
 * BufferedInputStream(InputStream in,int size):Creates BIS with specified buffer size, and saves its 
 * argument, the input stream in, for later use.
*/

public class BufferedInputStreamClass {
    public static void main(String[] args) throws IOException {
        FileInputStream fin=new FileInputStream("Sample2.txt");
        BufferedInputStream bin=new BufferedInputStream(fin);

 
        FileOutputStream fout=new FileOutputStream("Sample3.txt");
        BufferedOutputStream bout=new BufferedOutputStream(fout);

        int byteRead;
        byte[] buffer=new byte[1024];

        while((byteRead=bin.read(buffer))!=-1){
            bout.write(buffer, 0, byteRead);
        }

        while((byteRead=bin.read(buffer))!=-1){
            System.out.write(buffer, 0, byteRead);
        }







        //available() method returns integer value that number of bytes
        //that can be read(or skipped over) from this input stream 
        System.out.println("Number of reamining bytes: "+bin.available());

        //markSupported() this method tests if this input stream supports the mark and reset methods.
        boolean b=bin.markSupported();
        if(b)
        //mark() method points current position in the inputstream
            bin.mark(bin.available());

        //skip()method skips over and discards n bytes of data from this input stream.
        bin.skip(4);


    }
}
