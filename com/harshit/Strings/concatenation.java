package com.harshit.Strings;

import java.util.ArrayList;

public class concatenation {
    static void main() {
        System.out.println('a'+'b');   // passing a and b as characters therefore they will convert into their int values
        System.out.println("a"+"b");    // passing as string and hence concatenation will occur
        System.out.println("a"+'b');   // passing a as string and b as character therefore , b will convert into string and concatenation occur
        System.out.println("a"+1);      // 1 integer is converted into the string and concatenation will occur
        System.out.println('a'+1);       // a is passed as character and we are adding with it a integer value hence it will be converted into its integer value and returns a integer
        System.out.println((char)('a'+1));  // type conversion will occur we will get the character value of the integer.

        // therefore the value and conversion of the variable depends on the other operand , like if we are adding integer , character or a string with a string it will give us a string in return
        // if we are adding an integer or a character with an integeer it will give us an integer value.
        // character to charecter give integer value/.
        System.out.println("Harshit"+ new ArrayList<>(10));
        System.out.println("Harshit"+ new Integer(45));
//        System.out.println(new ArrayList<>() + new Integer(34));    // gives error , see in the notebook
        String ans = "Hello it works if there is atleast one string present in the expression to call the 'toStrings' method to convert the complex datatypes into strings";
        String ans2 = new Integer(34) +ans+ new ArrayList<>()+ " ";
        System.out.println(ans2);

    }

}
