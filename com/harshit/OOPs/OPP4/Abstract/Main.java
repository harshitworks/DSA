package com.harshit.OOPs.OPP4.Abstract;

public class Main {
    static void main(String[] args) {

        Son s = new Son(12);
        s.career("Engineer");
        s.partner("Eyes");

        Daughter d  = new Daughter(21);
        d.career("Roti-Maker");
        d.normal();
        d.askAge();
        s.askAge();
        System.out.println(d.fatherName);
    }
}
