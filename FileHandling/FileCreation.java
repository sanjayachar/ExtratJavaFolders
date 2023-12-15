package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileCreation {
    public static void main(String[] args) {
        // newFile1();
        newFile2();
    }
    /*This file creation mechanisme is using the FileOutputStream class */
    static void newFile2(){
        String strPath="",strName="";
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the file name: ");
            strName=br.readLine();
            System.out.println("Enter the file path: ");
            strPath=br.readLine();
            FileOutputStream fos=new FileOutputStream(strPath+""+strName);
        }catch(IOException e){
            e.printStackTrace();
        }
    }
    /*This file creatin mechanisme is using the File class */
    static void newFile1(){
        String strPath="",strName="";
        try{
            BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the file name: ");
            strName=br.readLine();
            System.out.println("Enter the file path: ");
            strPath=br.readLine();

            File file1=new File(strPath+""+strName);
            file1.createNewFile();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
