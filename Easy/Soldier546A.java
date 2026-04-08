package Easy;

import java.util.Scanner;

public class Soldier546A {
    static void main(String[] args) {
        Scanner input = new  Scanner(System.in);
        int k = input.nextInt();
        int n  = input.nextInt();
        int w =  input.nextInt();
        int total = k*w*(w+1)/2;
        System.out.println(total-n);
    }
}
