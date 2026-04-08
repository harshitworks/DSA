package com.harshit.Forces;

import java.util.*;
import java.io.*;

public class Hamburgers_371C {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static StringTokenizer st ;
    public static void main(String[] args) throws IOException {
        st = new StringTokenizer(br.readLine());
        String rec = st.nextToken();
        long na = nextLong();
        long nb = nextLong();
        long nc = nextLong();
        long pa = nextLong();
        long pb = nextLong();
        long pc = nextLong();
        long money =  nextLong();

        long ra = 0 ;
        long rb = 0 ;
        long rc = 0 ;
        long n = rec.length();
        for(int i = 0 ; i < n; i++) {
            char el = rec.charAt(i);
            if(el=='B') ra++;
            else if(el=='S') rb++;
            else rc++;
        }

        long ans = 0 ;
        long low = 0 ;
        long high = (long)1e13;
        while(low<=high) {
            long mid= low +  (high - low)/2;

            long needA= Math.max(0, mid*ra-na);
            long needB= Math.max(0, mid*rb-nb);
            long needC= Math.max(0, mid*rc-nc);
            long cost = needA*pa + needB*pb + needC*pc;
            if(cost<=money) {
                ans = mid ;
                low = mid+1;
            }
            else {
                high = mid-1;
            }

        }

        System.out.println(ans);
    }
    public static long nextLong() throws IOException {
        while(st==null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }
        return Long.parseLong(st.nextToken());
    }
}