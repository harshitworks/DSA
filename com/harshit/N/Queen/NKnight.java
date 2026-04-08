package com.harshit.N.Queen;

public class NKnight {
   public static void main(String[] args) {
        int n = 8 ;
        boolean[][] board = new boolean[n][n];
        knight(board,0,0,8);

    }
    public static void knight(boolean[][] board, int row, int col , int knights) {
        if(knights==0) {
            display(board);
            System.out.println();
            return;
        }
        if(row == board.length) {          // traversed all through the board
            return;
        }


        if(col==board.length) {            // changing the row or moving to the next row
            knight(board,row+1, 0, knights);
            return;
        }
        if(issafe(board, row , col)) {
            board[row][col]=true;
            knight(board, row, col+1, knights-1);
            board[row][col]=false;

        }
        // if the cell is not safe then move to next cell
        knight(board, row, col + 1, knights);

    }
     public static boolean issafe(boolean[][] board, int row , int col) {
        if(isvalid(board, row-2, col-1) && board[row-2][col-1]) return false ;
        if(isvalid(board, row-2, col+1) && board[row-2][col+1]) return false ;
        if(isvalid(board, row-1, col+2) && board[row-1][col+2]) return false ;
        if(isvalid(board, row-1, col-2) && board[row-1][col-2]) return false ;
        return true;

     }

     public static boolean isvalid(boolean[][] board, int row, int col) {
        if(row>=0 && row <= board.length-1 && col >=0 && col <= board.length-1) {
            return true;
        }
        return false;
     }


    public static void display(boolean[][] board) {
        for(int i = 0 ; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                if(board[i][j]) {
                    System.out.print(" 🐴 ");
                }
                else System.out.print(" ❌ ");

            }
            System.out.println();
        }
    }
}
