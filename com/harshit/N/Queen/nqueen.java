package com.harshit.N.Queen;

public class nqueen {
    static void main(String[] args) {
        int n = 4 ;
        boolean[][] board = new boolean[n][n];
        System.out.println(queen(board, 0));

    }
    public static int queen(boolean[][] board, int row) {
        if(row==board.length) {
            display(board);
            System.out.println();
            return 1 ;
        }

        int count = 0 ;
        // placing the queens in the board and checking for every row and column
        for(int col =0 ; col < board[0].length; col++) {
            if(issafe(board, row, col)) {
                board[row][col]= true;
               count+= queen(board,row+1);
                board[row][col]=false;

            }

        }
        return count;
    }

    public static boolean issafe(boolean[][] board, int row , int col) {

        //checking for vertical safe
        for(int i = 0; i< row; i++){
            if(board[i][col]) return false;
        }
        // checking right diagonal
        int right = Math.min(row, board[0].length-col-1);
        for(int i = 1 ; i <= right; i++) {
            if(board[row-i][col+i]) return false;
        }
        // checking left diagonal
        int left = Math.min(row, col);
        for (int i = 1; i <= left; i++) {
            if(board[row-i][col-i]) return false;

        }


        return true;
    }
    public static void display(boolean[][] boards) {
        for(boolean[] board: boards) {
            for(boolean element: board) {
                if(element) {
                    System.out.print(" 👑 ");
                }
                else System.out.print(" ❌ ");
            }
            System.out.println("");

        }
    }
}
