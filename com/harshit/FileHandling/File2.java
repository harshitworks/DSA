package com.harshit.FileHandling;

import java.io.FileReader;
import java.io.IOException;
import java.io.*;

public class File2 {
    static void main(String[] args) {

        try {
            FileReader fr = new FileReader("input.txt");   // we can use this above the block adjacent to try
            System.out.println("Reading from the file : ");
//            int num = fr.read();
            while(fr.ready()) {
//                System.out.println((char)num);
//                num = fr.read();
                System.out.println((char)fr.read());
            }

            System.out.println("LOOP ends here ");
        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // InputStreamReader converts byte stream to character stream and then BufferedReader reads the character data

        try {
            BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
            String str = br1.readLine();
            System.out.println("YOU typed: "+str);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

/// //////////////////////////////////////////////////////////////////////////////////////////////////////////


        try {
            BufferedReader br1 = new BufferedReader(new FileReader("input.txt"));

            while(br1.ready()) {
                System.out.println(br1.readLine());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        // reading from the file:
        try {
            BufferedReader br4 = new BufferedReader(new FileReader("createfile.txt"));

            while(br4.ready()) {
                System.out.println(br4.readLine());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }



    }
}
