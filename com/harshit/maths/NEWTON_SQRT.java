package com.harshit.maths;

public class NEWTON_SQRT {
    static void main() {
        int n = 36;
        double ans = newton_sqrt(n);
        System.out.printf("%.3f",ans);
    }

    static double newton_sqrt(int n ) {
        double x = n ;
        double root ;
        while(true) {
            root = 0.5*(x+(n/x));
            if(Math.abs(x-root)<0.5) break ;
            x = root ;
        }
        return root ;
    }
}
