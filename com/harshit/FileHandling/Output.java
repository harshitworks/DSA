package com.harshit.FileHandling;

import java.io.*;
import java.util.Scanner;

public class Output {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);




        // Output


        try( OutputStreamWriter osw1 = new OutputStreamWriter(System.out)) {
            osw1.write("Hello World");
            osw1.write('A');
            osw1.write(10);
            osw1.write(97);
            osw1.write('\n');
            osw1.write("New line");


        }
        catch(IOException e) {
            System.out.println(e.getMessage());
        }

        try(FileWriter fw = new FileWriter("fileoutput.txt", true)) {
            fw.append("\n Hey , I am appending this content by invoking the constructor by passing the filename and boolean value as true to append ");
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }

        // using BufferWriter
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("fileoutput.txt"))) {
            bw.write("Hare Krishnaaaaaaaaaaaa");
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }

        try(BufferedWriter bw1 = new BufferedWriter(new OutputStreamWriter(System.out))) {
            bw1.write("Hare Krishna");
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }





        ///  creating a new File
        try{
            File fo =  new File("createfile.txt");
            fo.createNewFile();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // writing in the file
        try(FileWriter fw3 = new FileWriter("createfile.txt")) {
            fw3.write("सर्वधर्मान्परित्यज्य मामेकं शरणं व्रज |\n" +
                    "अहं त्वां सर्वपापेभ्यो मोक्षयिष्यामि मा शुच: ");
        } catch(IOException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Check ");
        // deleting the file
        try {
            File f9 = new File("random.txt");
            if(f9.createNewFile()) {
                System.out.println("File created");
            }
            String name = f9.getName();
            if(f9.delete()) {
                System.out.println(name+" got deleted");
            }
            else {
                System.out.println("NOt deleted ");
            }

        } catch(IOException e) {
            System.out.println(e.getMessage()+" Error ");
        }



    }
}
