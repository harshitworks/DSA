package com.harshit.basics;
import java.util.Scanner ;
public class types_conversion {
      public static void main() {
         System.out.println("Hey there, just started the long and interesting journey ");
         Scanner input = new Scanner(System.in);

         int a = input.nextInt();
          System.out.println(a);


// Primitives Datatype:  these are the datatypes which cannot be broken or divided further into other datatypes
  // like we have int , float , char all are these primitive datatypes,
  // String can be divided into char, therefore String is not a primitive datatype.
          System.out.print("Enter Your Roll No: ");
          int rollno = input.nextInt();
          System.out.println("Your Roll No is: "+ rollno);
          int b= 15_20_111;                                  // '_' are ignored by the compiler in between the digits.
          System.out.println(b);



// Explicit type casting:
          float rab = 34.67f ;
          int bar= (int)(rab);
          System.out.println(bar);

  // Implicit type promotion
          int r= 258 ;
          byte s = (byte)r;           // as the maximum value that can store in byte is 256 , so when it exceed the max value it will store 'value % 256'
          System.out.println(r);
          System.out.println(s);

          byte p= 40;
          byte q= 50;
          byte t= 100;
          int k= p*q/t;                // when we are doing 40 * 50 it is exceeding the byte range , therefore complier implicitly convert the datatype to integer to do operation
          System.out.println(k);
          int z = 100;
//         z=z*2.5;                          // raise an error as we are trying to put float value in integer variable : putting larger value in smaller container.
//        p=p*2;                              // p is of byte datatype , and we are trying to assign a value which is integer type is also raise an error: larger in smaller.

// Implicit type conversion :
          int character= 'A';               // returns the ASCII value of the given character as is assigned to integer datatype : small value(character) in large container(integer).
          System.out.println(character);
          char numm = 66;                    // returns the character value of the given integer as it is assigned char datatype.
          System.out.println(numm);





    }
}
