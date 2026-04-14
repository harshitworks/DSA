package com.harshit.Practice;
import java.util.*;

class L73 {
    public void setZeroes(int[][] matrix) {
        Set<Integer> rset = new HashSet<>();
        Set<Integer> cset = new HashSet<>();
        int n = matrix.length;
        int m = matrix[0].length;
        for(int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < m ; j++) {
                if(matrix[i][j]==0) {
                    rset.add(i);
                    cset.add(j); 

                }
            }
        }
        for(int i = 0 ; i < n ; i++) {
            for(int j = 0 ; j < m ; j++) {
                if(rset.contains(i) || cset.contains(j)) {
                    matrix[i][j]=0;
                }
            }
        }
        
    }
}