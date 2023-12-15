package FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CRUDOperationInFile {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println("Enter your operation:");
            System.out.println("1.Create a file");
            System.out.println("2.Write to a file");
            System.out.println("3.Read from a File");
            System.out.println("4.Delete a file");
            System.out.println("5.Exit");

            System.out.println("Enter your choice: ");
            int choice=sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:createFile(sc);
                    break;
                case 2:writeToFile(sc);
                    break;
                case 3:readFromFile(sc);
                    break;
                case 4: deleteFile(sc);
                    break;
                case 5:System.out.println("Exiting the manue thank you");
                    System.exit(0);            
                default:System.out.println("Invalid choice");
                    break;
            }
        }
    }


    private static void createFile(Scanner sc){
        System.out.println("Enter the file name to create: ");
        String fileName=sc.nextLine();
        try{
            File file=new File(fileName);
            if(file.createNewFile())
            System.out.println("File created successfully...");
            else
            System.out.println("File already exist...");
        }catch(IOException e){
            System.out.println("An error occured boss while creating the file...!"+e.getMessage());
        }
    }


    private static void writeToFile(Scanner sc){
        System.out.println("Enter the name of the file to write to: ");
        String fileName=sc.nextLine();
        try{
            BufferedWriter write=new BufferedWriter(new FileWriter(fileName,true));
            String line;
            while(!(line=sc.nextLine()).equalsIgnoreCase("exit")){
                write.write(line);
                write.newLine();
            }
            System.out.println("Text written to the file successfully...");
            write.close();
        }catch(IOException e){
            System.out.println("An error occured boss while writing the content to the file...!");
        }
    }


    private static void readFromFile(Scanner sc){
        System.out.println("Enter te name of the file to read from: ");
        String fileName=sc.nextLine();
        try{
            BufferedReader reader=new BufferedReader(new FileReader(fileName));
            System.out.println("Contents of the file: ");
            String line;
            while((line=reader.readLine())!=null)
            System.out.println(line);
            reader.close();
        }catch(IOException e){
            System.out.println("An reeor occured boss while reading the content from the file...!"+e.getMessage());
        }
    }


    private static void deleteFile(Scanner sc){
        System.out.println("Enter the name of the file to delete: ");
        String fileName=sc.nextLine();
        File file=new File(fileName);
        if(file.exists()){
            if(file.delete())
                System.out.println("File deleted succefully....");
            else
                System.out.println("Unable to delete the file....");
        }
        else
            System.out.println("File does not exist.");
    }
}
