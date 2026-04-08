package com.harshit.FileHandling;
import java.io.*;

public class Main {
    public static void main(String[] args) {
            try (InputStreamReader br = new InputStreamReader(System.in)) {
                System.out.println("Enter some leters ");   // the characters or letters typed by the user will store in the buffer and accessed by InputStream one by one
                int num ;
                while((num= br.read()) != '\n')  {
//                    System.out.println(br.read());
                    System.out.println((char)num);
//                    num = br.read();
                }

                System.out.println("Out of loop");
            }
                /*
                when read() is inside loop:
                First iteration → waits for input
                After Enter → buffer filled
                Next iterations → read from buffer, no waiting


                 */

            catch (IOException e) {
                System.out.println(e.getMessage());
            }




    }
}
