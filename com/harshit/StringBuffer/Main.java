package com.harshit.StringBuffer;

import java.text.DecimalFormat;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Constructor 1 :
        StringBuffer sb =  new StringBuffer() ;
        StringBuffer sbb =  new StringBuffer() ;
        sb.append("This is constructor 1 ");
        System.out.println(sb.toString());
        sb.setLength(0);

        // Constructor 2 :
        StringBuffer sb2 = new StringBuffer("This is another Constructor 2 ");
        System.out.println(sb2.toString());

        // Constructor 3 : Giving capacity of StringBuffer , bydefault the capacity is 16
        StringBuffer sb3 = new StringBuffer(30);

        // Operations :
        sb.append("WemakeDevps");
        sb.append(" is nice!");
        System.out.println(sb.toString());
        sb.insert(2, " Rahul ");
        System.out.println(sb.toString());
        sb.insert(3, " Person ");
        System.out.println(sb.toString());
        sb.insert(1, " check ");
        System.out.println(sb.toString());

        sb2.replace(1,3,"okkkk");
        sb2.delete(1,4);
        System.out.println(sb2.toString());
        sb2.reverse();
        System.out.println(sb2.toString());
        System.out.println(sbb.capacity());
        System.out.println("-------------------------------------");
//        RandomString r1;
        String str = RandomString.generateString(12);
        System.out.println(str);

        String sentence = "harsh, parichet,  manik,    shubham";
        System.out.println(sentence);

        String[] names = sentence.split(",");
        System.out.println(Arrays.toString(names));
        sentence= sentence.replaceAll("\\s","");
        System.out.println(sentence);


        DecimalFormat df = new DecimalFormat();
        System.out.println(df.format(7.29999));

    }
}
