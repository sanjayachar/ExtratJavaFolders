package FileHandling;

import java.io.File;

public class FilePermission {
    public static void main(String[] args) {
        File file=new File("C:\\Users\\Sanja\\Documents\\JAVA\\IBMCoding\\OccurencesContinue.java");
        System.out.println("Is this file can readable: "+file.canRead());
        System.out.println("Is this file can writable: "+file.canWrite());
        System.out.println("Is this file can executable: "+file.canExecute());

        System.out.println("After changing the file permission");

        // file.setWritable(false);
        // System.out.println("Is this file can writable: "+file.canWrite());
        // file.setWritable(true);

        // file.setReadable(false);
        // System.out.println("Is this file can readable: "+file.canRead());
        // file.setWritable(true);

        file.setExecutable(false);
        System.out.println("Is this file can executable: "+file.canExecute());

    }
}
