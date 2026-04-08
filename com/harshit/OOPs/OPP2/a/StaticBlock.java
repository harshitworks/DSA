package com.harshit.OOPs.OPP2.a;

public class StaticBlock {
    static void main(String[] args) {
//        StaticBlock obj = new StaticBlock();
//        System.out.println(StaticBlock.a+" "+StaticBlock.b);
//        StaticBlock obj2 = new StaticBlock();
//        StaticBlock.b+=3;
//        System.out.println(StaticBlock.a+" "+StaticBlock.b);
        System.out.println(StaticBlock.a);
    }

static int a = 5 ;
static int b ;

// this is how to initialise the static variables
   static {
                            // this block will execute only once to initialise the value of b , when the variable is called
    System.out.println("this is static block ");
       b = a*4;
       a=0;

}

}
