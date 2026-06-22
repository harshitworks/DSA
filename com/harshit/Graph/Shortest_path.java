package com.harshit.Graph;

import java.util.*;

public class Shortest_path {
// Shortest path in undirected graph with a unit distance :
    static void main(String[] args) {
        List<List<Integer>> adj =  new ArrayList<>();
        int nodes = 9 ;
        for(int i=0; i<nodes; i++){
            adj.add(new ArrayList<>());
        }
        int[] dis = new int[nodes];
        Arrays.fill(dis,Integer.MAX_VALUE);

            adj.get(0).addAll(Arrays.asList(1,3));
            adj.get(1).addAll(Arrays.asList(0,2,3));
            adj.get(2).addAll(Arrays.asList(1,6));
            adj.get(3).addAll(Arrays.asList(0,1,4));
            adj.get(4).addAll(Arrays.asList(3,5));
            adj.get(5).addAll(Arrays.asList(4,6));
            adj.get(6).addAll(Arrays.asList(2,5,7,8));
            adj.get(7).addAll(Arrays.asList(6,8));
            adj.get(8).addAll(Arrays.asList(6,7));
        System.out.println(Arrays.toString(path(adj, 0, dis)));


    }
    public static int[] path(List<List<Integer>> adj, int start, int[] dis){
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        dis[start]= 0 ;

        while(!q.isEmpty()){
            int node = q.poll();
            for(int child : adj.get(node)){
                if(dis[child] > dis[node] + 1){
                    dis[child] = dis[node] + 1;
                    q.offer(child);
                }
            }
        }
        return dis;
    }
    public static int[] weighted_path(List<List<Pair>> adj, int start, int[] dis){
        Queue<Integer> q = new LinkedList<>();
        q.offer(start);
        dis[start]= 0 ;

        while(!q.isEmpty()){
            int node = q.poll();
            for(Pair p : adj.get(node)){
                int child = p.child;
                int distance = p.distance;
                //as this is undirected graph one node  may be pushed multiple times which can cause in efficiency : 
                if(dis[child] > dis[node] +  distance){
                    dis[child] = dis[node] + distance;
                    q.offer(child);
                }
            }
        }
        return dis;
    }


}
class Pair {
    int distance;
    int child;
    public Pair(int child, int distance) {
        this.distance = distance;
        this.child = child;
    }
}
