package com.harshit.Strings;

public class placeholders {
    static void main() {
        float j = 36.651111112f;
        String a = "Kunal";
        System.out.printf("%.3f",j);       // so in java we also have formatted print which works with the format of the variable  like %d , %f , %s, %c , %n  etc..
        System.out.println(j);
        System.out.printf("%s",a);
        System.out.printf("My name is %s and I am very %s person", "Harshit", "Intellectual");


    }
}
