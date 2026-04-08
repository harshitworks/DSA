package com.harshit.Recursion_G_and_Am_Ques;

import java.util.ArrayList;
import java.util.List;

public class Dice_thrown {
    static void main(String[] args) {
        String p = "";
        dice(p,4);
        System.out.println(dice2(p, 6));

    }
    public static void dice(String p,int target ) {
        if(target==0) {
            System.out.println(p);
            return;
        }

        for(int i = 1 ; i < 7 && i <= target ; i++ ) {
            dice(p+i,target-i);
        }
    }

    public static List<String> dice2(String p , int target) {
        if(target==0) {
            List<String> list = new ArrayList<>();
            list.add(p);
            return list ;


        }
        List<String> outer = new ArrayList<>();
        for(int i = 1 ; i < 7 && i <= target ; i++ ) {
            outer.addAll(dice2(p+i,target-i));

        }
        return outer;

    }
}
