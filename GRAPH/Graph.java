import java.util.*;

public class Graph {
    
    private int v;
    private LinkedList<Integer>[] adj;

    public Graph(int v){
        this.v = v;
        adj = new LinkedList[v];

        for(int i=0;i<v;i++){
            adj[i] = new LinkedList<>();
        }

    }

    public void addEdge(int u,int v,boolean bidir){
        adj[u].add( v);

        if(bidir){
            adj[v].add(u);
        }
    }

    public void printAdjList(){

        for(int i=0;i<v;i++){

            System.out.print(i +"->");
            for(int node:adj[i]){
                System.out.print(node +",");
            }
            System.out.println();
        }
    }

    public void dfs(int src){
        HashMap<Integer,Boolean> visited = new HashMap<>();
        dfsHelper(src, visited);
    }

    private void dfsHelper(int src, HashMap<Integer, Boolean> visited) {
        visited.put(src,true);
        System.out.print(src +" ");

        for(int neighbour:adj[src]){
            if(!visited.containsKey(neighbour)){
                dfsHelper(neighbour, visited);
            }
            
        }
    }

    public static void main(String[] args) {
        Graph g = new Graph(10);

        g.addEdge(0, 1, true);
        g.addEdge(1, 3, true);
        g.addEdge(2, 4, true);
        g.addEdge(3, 4, true);
        g.addEdge(2, 5, true);
//        g.printAdjList();
        g.dfs(0);

    }
}
