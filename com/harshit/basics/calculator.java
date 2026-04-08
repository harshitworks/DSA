package com.harshit.basics;

import java.util.Scanner;

public class calculator {
    public static void main() {

        Scanner input = new Scanner(System.in);
char op;
while (true) {
    int ans=0;
    System.out.println("Enter Your operator ");
    op = input.next().charAt(0);
    System.out.println("Enter Your operands: ");
    int a = input.nextInt();
    int b = input.nextInt();


    if(op =='+')
    {
        ans= a+b;
    }

   else if(op== '-')
    {
        ans = a-b;
    }
    else if(op=='*')
    {
        ans=a*b;
    }
    else if(op=='/')
{
    ans=a/b;
}
    else if(op=='%')
{
    ans=a%b;
}
    System.out.print("Your Ans:");
    System.out.println(ans);
    System.out.println("------   --------   -------    ---------   -------  --------");



}













    }

    public static class if_else {
        public static void main() {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter Your Numbers: ");
            int p = input.nextInt();

            int q = input.nextInt();
            int r = input.nextInt();


            // Find the largest number in the given three numbers:
            int max= p;
            if(q>max)
            {
                max=q;
            }
            if(r >max)
            {
                max= r;
            }
            System.out.print("Largest Number is: ");
            System.out.println(max);


    // using the in built functions 'max'
            System.out.print("Largest Number is: ");
            System.out.println(Math.max(r, Math.max(p,q)));



    // finding whether it is lowercase or uppercase:
            System.out.print("Enter your word: ");
            char ch = input.next().trim().charAt(0);
            if ( ch >='a' && ch <= 'z') {
                System.out.println("Lowercase");

            }
            else {
                System.out.println("Uppercase");
            }



    // fibonacci series:
            System.out.println("Enter the value of n ");
            int n = input.nextInt();
            int a = 0;
            int b = 1;
            System.out.print(a+",");
            System.out.print(b+",");
            int count = 2 ;
            while(count <= n)
            {
                int c = a+b;
                System.out.print(c+",");
                a=b;
                b=c;
                count++;
            }








        }
    }
}
