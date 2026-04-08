package com.harshit.maths;

public class effective_prime {
    static void main() {
        int n = 37;

        sieve(n);

    }

    static void sieve(int n) {
        boolean[] lock = new boolean[n + 1];
        for (int i = 2; i * i <= n; i++) {
            if (!lock[i]) {                    // as the numbers are initially unclocked..so accessing them if unlocked.
                for (int j = i * 2; j <= n; j += i) {
                    lock[j] = true;         // here we are locking the factors of a number encounterd in the iteration.

                }
            }

        }
        // printing the prime no, or number which are unlocked ..
        for (int i = 2; i <= n; i++) {
            if(!lock[i]) System.out.print(i+",");

        }
    }


}
