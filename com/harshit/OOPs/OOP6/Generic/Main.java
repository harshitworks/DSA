package com.harshit.OOPs.OOP6.Generic;

public class Main {
    static void main(String[] args) {
        CustomArrayList cs  = new CustomArrayList();
        cs.add( 1 );
        System.out.println(cs.remove());
//        System.out.println(cs.remove());
        cs.add( 2 );
        cs.add( 3 );
        cs.add( 4 );
        cs.add( 5 );
        cs.add( 6 );
        cs.add( 7 );
        cs.add( 8 );
        cs.add( 9 );
        cs.add( 10 );
        cs.add( 11 );
        cs.add( 12 );
        cs.add( 13 );

        GenericArrayList<String> cs2  = new GenericArrayList<>();
        cs2.add( "A" );
        cs2.add( "B" );
        cs2.add( "C" );
        cs2.add( "D" );
        cs2.display();

    }
}
