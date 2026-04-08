package com.harshit.Backtracking;

import java.util.ArrayList;
import java.util.Arrays;

public class all_paths_backtracking {
    static void main(String[] args) {
        boolean[][] board2 = {
                {true , true, true},
                {true , true, true},
                {true , true, true}
        };
        System.out.println(all_path(0,0,"", board2));


        int[][] arr = new int[board2.length][board2[0].length];
        System.out.println(print_path(0,0,"",board2,1,arr));
    }
    public static ArrayList<String> all_path(int r , int c , String p , boolean[][] maze) {
        System.out.println("Visiting: " + r + "," + c);

        if(!maze[r][c]) {
            return new ArrayList<>();    // blocks that paths which initiates from false or river condition too

        }
        if(r== maze.length-1 && c== maze[0].length-1) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        maze[r][c]=false;
        if(r< maze.length-1) ans.addAll(all_path(r+1, c , p+"D", maze));
        if(c < maze[0].length-1) ans.addAll(all_path(r , c+1 ,p+"R", maze));
        if(r > 0 ) ans.addAll(all_path(r-1,c,p+"U", maze));
        if(c> 0 ) ans.addAll(all_path(r,c-1,p+"L", maze));
        maze[r][c]=true;     // here we are changing the changes made before this recursive function call and this is known as backtracking.
        return ans;
    }

    public static ArrayList<String> print_path(int r, int c, String p, boolean[][] maze, int step, int[][] arr) {
        if(!maze[r][c]) {
            return new ArrayList<>();
        }
        if(r == maze.length-1  && c==maze[0].length-1) {
            arr[r][c]=step;
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            for(int[] num: arr) {
            System.out.println(Arrays.toString(num));
            }
            System.out.println(p);
            System.out.println();
            return list;

        }
        ArrayList<String> ans = new ArrayList<>();
        maze[r][c]=false;
        arr[r][c]=step;
        if(r>0) ans.addAll(print_path(r-1,c,p+"U",maze,step+1,arr));
        if(c>0) ans.addAll(print_path(r,c-1,p+"L",maze,step+1,arr));
        if(r < maze.length-1 ) ans.addAll(print_path(r+1,c,p+"D",maze,step+1,arr));
        if(c < maze[0].length-1) ans.addAll(print_path(r,c+1,p+"R",maze,step+1,arr));
        maze[r][c]=true;
        arr[r][c]=0;
    return ans;
    }
}
