package com.harshit.Graph;

import java.util.*;

public class BFS {
    static void main(String[] args) {
        List<List<Integer>> adj = new ArrayList<>();
        adj.add(new ArrayList<>(Arrays.asList( )));
        adj.add(new ArrayList<>(Arrays.asList(2,6)));
        adj.add(new ArrayList<>(Arrays.asList(1,3,4)));
        adj.add(new ArrayList<>(List.of(2)));
        adj.add(new ArrayList<>(Arrays.asList(2,5)));
        adj.add(new ArrayList<>(Arrays.asList(4,8)));
        adj.add(new ArrayList<>(Arrays.asList(7,9)));
        adj.add(new ArrayList<>(Arrays.asList(6,8)));
        adj.add(new ArrayList<>(Arrays.asList(5,7)));
        adj.add(new ArrayList<>(Arrays.asList(6)));
        System.out.println(adj);
        System.out.println(bfs(adj,1));

    }
    public static List<Integer> bfs(List<List<Integer>> adj, int start) {
        boolean[] visited = new boolean[adj.size()];
        List<Integer> list = new ArrayList<>();
        Queue<Integer> qu =  new LinkedList<>();
        qu.add(start);
        visited[start] = true;
        while(!qu.isEmpty()) {
            Integer curr = qu.poll();
            list.add(curr);

            for(int child : adj.get(curr)) {
                if(!visited[child]) {
                    visited[child] = true;
                    qu.add(child);
                }
            }
        }
    return list ;
    }
}
