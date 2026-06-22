package com.harshit.Graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Min_Multiplication {
    public static void main(String[] args) {
        int[] arr = {2,5,7};
        int start = 3 ;
        int end = 84 ;
        int count = minStep(arr, 0, start, end);
        System.out.println(count);
        System.out.println(bfs(arr, start, end));
    }
    public static int minStep(int[] arr, int step, int start , int end)  {
        // base - case :
        if(start == end) return step ;

        int ans = Integer.MAX_VALUE;
        step = step + 1;
        for(int num : arr) {
            int x = num * start ;
            if(x> end) continue;
            if(x == end) {
                ans = Math.min(ans, step);
            }
            if(step >= ans) return Integer.MAX_VALUE;
        }
        return -1;
    }

    public static int bfs(int[] arr, int start, int end) {
        int[] dist = new int[100000];
        Arrays.fill(dist, Integer.MAX_VALUE);
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(start, 0));
        dist[start] = 0;
        while(!q.isEmpty()) {
            Pair p = q.poll();
            int node = p.node ;
            int steps = p.step;

            for(int x : arr) {
                int num = (node * x ) % 100000 ;
                if(dist[num] > 1 + steps) {
                    dist[num] = 1 + steps;
                    q.add(new Pair(num, steps+1));
                }
                if(num == end) return dist[num];
            }
        }

        return -1 ;
    }
    static class Pair{
        int node;
        int step;
        public Pair(int x, int y) {
            this.node = x;
            this.step = y;
        }
    }
}
