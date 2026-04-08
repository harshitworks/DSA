package com.harshit.TicTac;
import java.util.Scanner;

public class Game {
    static void main(String[] args) {
        char[][] board = {
                {' ',' ',' '},
                {' ',' ',' '},
                {' ',' ',' '}

        };


        Scanner input = new Scanner (System.in);
        boolean gameover = false;

        char player = 'X';
        int moves = 0;
        while(!gameover){
            if (moves == 9) {
                print(board);
                System.out.println("It's a Draw 🤝");
                break;
            }
            print(board);
            System.out.print("Player "+ player+" enter :");
            int row =  input.nextInt();
            int col = input.nextInt();
            if (row < 0 || row > 2 || col < 0 || col > 2) {
                System.out.println("Out of bounds! Try again.");
                continue;
            }
            if(board[row][col]==' ') {
            moves++;
                board[row][col] = player;
                gameover = won(board, row, col, player);
                if(gameover){
                    print(board);
                }
                player = (player == 'X') ? 'O' : 'X';
            }
            else {
                System.out.println("Invalid Move ❌");

            }
        }
    }

    public static boolean won(char[][] board, int row , int col, char player) {
        char el = board[row][col];

        // check the row
            if(board[row][0]==el && board[row][1]==el && board[row][2]==el) {System.out.println("Player "+player+" WON 💪"); return true;}
        // check column
           else if(board[0][col]==el && board[1][col]==el && board[2][col]==el){System.out.println("Player "+player+" WON 💪"); return true;}
        // check the diagonal
            else if(board[0][0]==el && board[1][1]==el && board[2][2]==el){System.out.println("Player "+player+" WON 💪"); return true;}
            else if(board[0][2]==el && board[1][1]==el && board[2][0]==el){System.out.println("Player "+player+" WON 💪"); return true;}
            // otherwise false;
            else  return false;

    }

    public static void print(char[][] board) {
        for(int i= 0; i< board.length; i++) {
            for(int j= 0 ; j< board[i].length; j++) {
                if(board[i][j]=='X') {
                System.out.print("♠️   |");
                }
                else if(board[i][j]=='O') {
                System.out.print("♥️  |");
                }
                else System.out.print("("+i+","+j+") |");
            }
            System.out.println();

        }
        System.out.println("----------------------------------");

    }
}
