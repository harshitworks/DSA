package com.harshit.basics;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
Scanner input = new Scanner(System.in);

//loops


  // while loops are used when we donot know the the number of times the loop is going to execute
        int a=0 ;
        while(a!=10){
            System.out.println("we are here again");
            a=a+2;
        }


// for loops are used there , where we know the number of times the loop is going to execute.

  int i = 1;
  for(i=1; i<=10;i++){
      System.out.print(i+" ");

  }

// do-while it will execute atleast once.
        int number;
        do {
            System.out.println("Enter the number or type -1 to exit.");
            number= input.nextInt();
            System.out.print("Your Number is: ");
            System.out.println(number);
        } while(number!= -1);



    }
    }
