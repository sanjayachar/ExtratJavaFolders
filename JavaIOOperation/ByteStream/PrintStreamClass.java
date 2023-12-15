package ByteStream;

import java.io.DataInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Locale;

/*It adds functionality to another output stream, namely 
 * the ability to print representations of various data values
 * conveniently
 * 
 */
public class PrintStreamClass {
    public static void main(String[] args) throws Exception {
        FileOutputStream fout=new FileOutputStream("C:\\Users\\Sanja\\Documents\\JAVA\\Sample3.txt");

        PrintStream out=new PrintStream(fout);

        String s="first";

        char[]ch={'S','A','N','J','A','Y'};

        out.print(true);
        out.print(1);
        out.print(4.333f);
        out.print("SanjayBN");
        out.println();
        out.println(ch);
        out.append(s);
        out.println();
        out.println(out.checkError());
        out.format(Locale.ITALY,"Welcome to my program",s);

        out.flush();
        out.close();
        PrintStream out2=new PrintStream(System.out);
        out2.println();
        
        DataInputStream in=new DataInputStream(System.in);
        int a=in.readInt();

        PrintStream ps=new PrintStream(System.out);
        ps.print(a);
    }
}
