package com.harshit.recursion_level_1;

public class print_1_to_n {
    static void main() {
        ton(5);
        ton_rev(5);
    }




    static void ton(int n ) {
        if(n==0) return;

        System.out.println(n);
        ton(n-1);
          // here the order of both lines matter alot , as if put the print line above the calling line then , first it will print the value of n and then call n-1 function so we get...5,4,3,2,1,
        // but we if put the print line below the function call , then for n function it will call n-1 function and it will call n-2 and so on..till function 0 then it returns and end the function 0 then  it will end the function 1 and lines below executed that print 1 ,after it function 2 will be completed and lines below it will be print .

        // so the conclusion is we put the print below function call then it will print the values from when it will removed from the stack .
    }
    static void ton_rev(int n ) {
        if (n == 0) return;

        ton_rev(n-1);
        System.out.println(n);
    }
}
