package ByteStream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
/*
 * DataInputStream enables an appliation to read primitive java data types 
 * from input stream.
 * That is why it is called DIS-it reads data instead of just bytes.
 * An application uses a data output stream to write data that can later be read by data input stream.
 * DIS and DOS represent Unicode strings in a format.
 * These classes need to read and write binary data
 * 
 * It's important to note that:
 * ----------------------------
 * These classes primarily work with primitive data types and are not suitable for reading or
 * writing complex objects.
 * 
 * 
 * Remember: The DataInputStream class is often used together with a DataOutputStream.
 */
public class DataInputStreamClass {
    public static void main(String[] args) {
        try{
            DataOutputStream dout=new DataOutputStream(new FileOutputStream("C:\\Users\\Sanja\\Documents\\JAVA\\Sample2.txt"));
            dout.writeDouble(9012.2);
            dout.writeInt(55);
            dout.writeBoolean(true);
            dout.writeChar('>');
            DataInputStream din=new DataInputStream(new FileInputStream("C:\\Users\\Sanja\\Documents\\JAVA\\Sample2.txt"));
            double a=din.readDouble();
            int b=din.readInt();
            boolean c=din.readBoolean();
            char d=din.readChar();
            System.out.println("Values: "+a+" "+b+" "+c+" "+d);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
