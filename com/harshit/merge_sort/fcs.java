package com.harshit.merge_sort;

import java.util.Arrays;

public class fcs {
    static void main(String[] args) {
        int pro = 5 ;
        int[] arrival = {0, 1,2,3,4};
        int[] burst = {4,3,1,2,5};

        int[] completion = new int[arrival.length];
        completion[0]=burst[0];
        for (int i = 1; i < pro; i++) {
            completion[i]=burst[i]+completion[i-1];
            
        }
       int[] turnaround= new int[pro];
        for (int i = 0; i < pro; i++) {
            turnaround[i]=completion[i]-arrival[i];

        }
        int[] waiting = new int[pro];
        for (int i = 0; i < pro; i++) {
            waiting[i]=turnaround[i]-burst[i];
        }
        System.out.println("-----------------------------------------------");
        System.out.println("Completion time");
        System.out.println(Arrays.toString(completion));
        System.out.println("-----------------------------------------------");
        System.out.println("Turnaround time");
        System.out.println(Arrays.toString(turnaround));
        System.out.println("-----------------------------------------------");
        System.out.println("Waiting time");
        System.out.println(Arrays.toString(waiting));

    }

    
}
