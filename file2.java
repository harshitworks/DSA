import java.util.Scanner;

public class file2 {
    

    public static void main(String[] args) {
        int[][]  grid = {
                {0,0,1} ,
                {1,1,0},
                {1,0,0}
        };

        int a = minSwaps(grid);
        System.out.println(a);
    }

    public static int minSwaps(int[][] grid) {
        int n = grid.length;
        int swap = 0 ;
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++)  {
            for(int j = n-1 ; j>=0; j--) {
                if(grid[i][j]==1) {
                    arr[i]=j;
                    break;
                }
            }
        }
        for(int i = 0 ; i< n-1; i++) {
            if(arr[i]==arr[i+1]) return -1 ;
            for(int j = 0 ; j <n-1 ; j++) {
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }
            }
        }
        return swap;

    }


}
