package com.harshit.maths;

public class square_root {
    static void main() {
        int n = 323 ;
        double ans = sqrt(n);
        System.out.printf("%.3f", ans);  // pretty print
    }



    // as the square root of a number exist in the range of 1 to n , so here we can apply binary search and then check if a number square is equals to that number
    static double sqrt(int n ) {
                double start = 1 ;
                double end = n ;
                double mid = 0 ;
                while(start<=end) {
                   mid = start+(end-start)/2;
                  if(mid*mid==n) return mid;
                  if(mid*mid> n ) end = mid-1 ;
                  else start= mid + 1 ;
                }
        mid = end ;   // till here we will get the integer value of the square root of the number


        // we are adding the fractional part in the number to pth place.
        int p = 6 ;
            double dec = 0.1;
            for (int i = 0; i < p; i++) {
                while(mid*mid<n) {
                    mid = mid + dec;
                    }
                mid = mid - dec ;
                dec = dec/10;
            }
            return mid ;
        }
}



