package FileHandling;
import java.io.*;
public class FileProperty {
    public static void main(String[] args) {
        // isFileOrNot1();
        contentOfFile();
    }
    /*Program to check if a file or directory physically exists or not */
    static void isFileOrNot1(){
        String fname="IBMCoding/HCF.java";
        //passing the string object as a file name 
        File f=new File(fname);
    
        //.getName() shows the name of the file
        System.out.println("File name: "+f.getName());
        //.getPath() gets the path of the file
        System.out.println("Path: "+f.getPath());
        //.getAbsolutePath() prints the entire or absolute pathe of the file
        System.out.println("Absolute path: "+f.getAbsolutePath());
        //.getParent() prints the Parent folder of that file
        System.out.println("Parent: "+f.getParent());
        //.exists() returns true if file exists or else false
        System.out.println("Exists: "+f.exists());
        if(f.exists()){
            //.canWrite() returns true if that file can be writable 
            System.out.println("Is writable: "+f.canWrite());
            //.canWrite() returns true if that file can be readable
            System.out.println("Is readable: "+f.canRead());
            //.isDirectory() returns true if that file is a directory
            System.out.println("Is a directory: "+f.isDirectory());
            //.length() returns integer or length of the fle in bytes
            System.out.println("File size in bytes: "+f.length());
        }
    }
    /*
    Program to display all the contents of a directory 
    
    */
    static void contentOfFile(){
        String dPath="C:\\Users\\Sanja\\Documents\\";
        String dName="JAVA";

        File f=new File(dPath,dName);
        if(f.exists()){

            String arr[]=f.list();
            int n=arr.length;
            for(int i=0;i<n;i++){
                // System.out.println(arr[i]);
                File f1=new File(arr[i]);
                if(f1.isFile())
                    System.out.println(f1.getName()+": is a file");
                if(f1.isDirectory())
                    System.out.println(f1.getName()+": is a directory");
            }
            System.out.println("Number of files in this directory is: "+n);
        }else{
            System.out.println("Directory not found");
        }
    }
}
