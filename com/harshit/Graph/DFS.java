package com.harshit.Graph;

import java.util.*;



public class DFS {
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
        Queue<Integer> qu = new LinkedList<>();
        qu.add(1);
        List<Integer> list = new ArrayList<>();
        boolean[] visited = new boolean[adj.size()];
        visited[1] = true;


        dfs(adj, qu, list, visited, 1);
        System.out.println(list);

    }
    public static void dfs(List<List<Integer>> adj, Queue<Integer> qu , List<Integer> list , boolean[] visited, int node ) {
        list.add(node);
        visited[node] = true;
        for(Integer child : adj.get(node)) {
            if(!visited[child]) {
                dfs(adj, qu, list, visited, child);
            }
        }

    }
}
