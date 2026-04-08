package com.harshit.Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Maze {
    static void main(String[] args) {
        System.out.println(maze(3,3));
        System.out.println(maze2(2,2,1,2));

        maze_path(3,3,"");
        System.out.println(mazepath(3,3,""));
        System.out.println(maze_path_diagonal(3,3,""));
        boolean[][] board = {
                {true , true, true},
                {true , false, true},
                {true , true, true}
        };
        System.out.println(maze_river(0,0,"",board));

    }

    public static int maze(int r , int c ) {
        if(r==1 || c==1) {
            return 1 ;
        }
        int left = maze(r-1, c);
        int right = maze(r, c-1);
        int ans = left + right ;
        return ans ;
    }

//    -----------------------------------------------------------------------------------------------------------------------------------------

    public static int maze2(int r , int c, int m , int l ) {
        if(r==m || c==l) { // if we reached the same row or column as the destination then there will be only single path that is straight path
            return 1 ;
        }
        int left = maze(r-1, c);
        int right = maze(r, c-1);
        int ans = left + right ;
        return ans ;
    }






    public static void maze_path(int r , int c, String p  ) {
        if(r==1 && c==1) {
            System.out.println(p);
            return;
        }
        if(r>1) maze_path(r-1, c,p+"D");
        if(c>1) maze_path(r, c-1,p+"R");
    }

    public static ArrayList<String> mazepath(int r , int c , String p) {
        if(r==1&& c==1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if(r>1) {
            ans.addAll(mazepath(r-1,c,p+"D"));
        }
        if(c>1) {
            ans.addAll(mazepath(r,c-1,p+"R"));
        }
        return ans;
    }









    public static ArrayList<String> maze_path_diagonal(int r , int c , String p) {
        if(r==1&& c==1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        if(r>1 && c >1) {
            ans.addAll(maze_path_diagonal(r-1,c-1,p+"↘️"));
        }
        if(r>1) {
            ans.addAll(maze_path_diagonal(r-1,c,p+"⬇️"));
        }
        if(c>1) {
            ans.addAll(maze_path_diagonal(r,c-1,p+"➡️"));
        }
        return ans;
    }






    public static ArrayList<String> maze_river(int r , int c , String p , boolean[][] maze) {
        if(r== maze.length-1 && c== maze[0].length-1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        if(!maze[r][c]) {
            return new ArrayList<>();

        }

        ArrayList<String> ans = new ArrayList<>();
        if(r< maze.length-1) {
            ans.addAll(maze_river(r+1, c , p+"D", maze));
        }
        if(c < maze[0].length-1) {
            ans.addAll(maze_river(r , c+1 ,p+"R", maze));
        }
        return ans;
    }

    //    -----------------------------------------------------------------------------------------------------------------------------------------


// this function will give stack overflow in the execution because during the recursion calls , the function calls itself without any breaking condition therefore , we need to put a condition such that recusive fucntions cannot call their main function to avoid overflow
    public static ArrayList<String> all_paths(int r , int c , String p , boolean[][] maze) {
        if(r== maze.length-1 && c== maze[0].length-1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        if(!maze[r][c]) {
            return new ArrayList<>();


        }

        ArrayList<String> ans = new ArrayList<>();
        if(r< maze.length-1) {
            ans.addAll(all_paths(r+1, c , p+"D", maze));
        }
        if(c < maze[0].length-1) {
            ans.addAll(all_paths(r , c+1 ,p+"R", maze));
        }
        if(r > 0 ) ans.addAll(all_paths(r-1,c,p+"U", maze));
        if(c> 0 ) ans.addAll(all_paths(r,c-1,p+"L", maze));
        return ans;
    }








//    -----------------------------------------------------------------------------------------------------------------------------------------




}
