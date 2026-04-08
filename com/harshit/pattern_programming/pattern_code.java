package com.harshit.pattern_programming;

public class pattern_code {
    static void main() {

        pattern1(5);
        pattern2(5);
        pattern3(5);
        pattern4(5);
        pattern5(5);
        pattern28(5);
        pattern30(5);
        pattern17(4);
        pattern31(6);
        pattern6(5);


    }

    static void pattern1(int n) {
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= n ;j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
    static void pattern2(int n) {
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= i ;j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
    static void pattern3(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i ; j--) {
                System.out.print("* ");

            }
            System.out.println();

        }
    }
    static void pattern4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j+" ");

            }
            System.out.println();

        }
    }
    static void pattern5(int n) {
        for (int i = 1; i <=2*n-1; i++) {
            int formula ;
            if(i<=n)  formula = i;
            else formula = 2*n -i ;
            for (int j = 1; j <= formula ;j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
    static void pattern6(int n) {
        for (int i = 1; i <=n; i++) {
            int spaces = n-i ;
            for (int j = 1; j <=spaces ; j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <= i ;j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
    static void pattern28(int n) {
        for (int i = 1; i <=2*n-1; i++) {
            int formula, spaces ;
            if(i<=n)  formula = i;
            else formula = 2*n -i ;
            spaces = n-formula ;
            for (int k = 0; k <= spaces; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= formula ;j++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
    static void pattern30(int n) {
        for (int i = 1; i <=n; i++) {
            int spaces = n-i ;
            for (int k = 0; k <= spaces; k++) {
                System.out.print(" ");
            }
            for (int j =i ; j >=1; j--) {
                System.out.print(j);

            }
            for (int j = 2; j <= i ;j++) {
                System.out.print(j);
            }
            System.out.println();

        }
    }

    // very Good questions :
    static void pattern17(int n) {
        for (int i = 1; i <=2*n-1; i++) {
            int spaces ;
            int c = i > n ? 2*n-i : i ;
            spaces = n-c;
            for (int k = 0; k <= spaces; k++) {
                System.out.print(" ");
            }


            for (int j =c ; j >=1; j--) {
                System.out.print(j);

            }
            for (int j = 2; j <= c ;j++) {
                System.out.print(j);
            }
            System.out.println();

        }
    }

    static void pattern31(int n) {
        for (int i = 1; i <=2*n-1; i++) {
            for (int j = 1; j <= 2*n-1 ;j++) {
                int upper = i-1;
                int left = j-1;
                int right =2*n-1-j;
                int bottom = 2*n-1-i;
                int sol=Math.max(Math.max(upper,left),Math.max(bottom, right));

                System.out.print(sol-2+" ");
            }
            System.out.println();

        }
    }





}
