import java.util.*;
import java.io.*;
import java.util.*;
import java.io.*;

public class Input {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line1 = br.readLine();
        StringTokenizer st = new StringTokenizer(line1);
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int[] arr = new int[n];
        String line2 = br.readLine();
        st = new StringTokenizer(line2);
        for(int i = 0 ; i< n ; i++) {
            arr[i]=Integer.parseInt(st.nextToken());
        }

    }

    // Template for taking Input


    public class Main {

        static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        static StringTokenizer st;

        public static void main(String[] args) throws Exception {
            int t = nextInt();
            while(t-- > 0) {
                solve();
            }
        }

        static void solve() throws Exception {
            int n = nextInt();
            int k = nextInt();

            int[] arr = new int[n];
            for(int i = 0; i < n; i++) {
                arr[i] = nextInt();
            }

            System.out.println(n + k);
        }

        static int nextInt() throws Exception {
            while (st == null || !st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
            }
            return Integer.parseInt(st.nextToken());
        }

        static long nextLong() throws Exception {
            while (st == null || !st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
            }
            return Long.parseLong(st.nextToken());
        }

        static String next() throws Exception {
            while (st == null || !st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
            }
            return st.nextToken();
        }

        static String nextLine() throws Exception {
            return br.readLine();
        }
    }

}
