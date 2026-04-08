package com.harshit.N.Queen;

public class Suduko {
    static void main(String[] args) {

    }

    public static void suduko(int[][] board  , int row ) {
        return;


    }

    public static boolean issafe(int[][] board, int row , int col, int number) {
        // checking the column
        for (int i = 0; i < board.length; i++) {
                if(board[i][col]==number) return false;
        }
        // checking the row
        for (int i = 0; i < board.length; i++) {
                if(board[row][i]==number) return false;
        }

        // checking in the small n x n square
        int sqr = (int)Math.sqrt(board.length);
        int rowstart = row - row % sqr ;
        int colstart = col - col % sqr ;
        int rowend = rowstart+ sqr ;
        int colend = colstart +  sqr ;

        for (int i = rowstart; i <rowend ; i++) {
            for (int j = colstart; j < colend; j++) {
                if(board[i][j]==number) return false;

            }

        }

        return true;

    }


}
