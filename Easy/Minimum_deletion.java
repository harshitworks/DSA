package Easy;


import java.util.Scanner;

public class Minimum_deletion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        String sb = input.nextLine();
        StringBuilder s = new StringBuilder(sb);
        int ans = 0 ;
        int l = 0 ;
         int r = l+1 ;
         int k = s.length();
         while(r<k) {
             while(s.charAt(r) == s.charAt(l)){
                 s.deleteCharAt(r);
                 ans++;
             }
             l++;
             r++;
             k =  s.length();
         }
         System.out.println(ans);
    }
}
