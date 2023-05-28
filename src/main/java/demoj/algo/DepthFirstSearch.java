package demoj.algo;

public class DepthFirstSearch {

    public static void main(String[] args) {
        Graph g = new Graph(6);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 4);
        g.addEdge(3, 5);
        g.addEdge(4, 5);
        g.dfs(0);
    }
	
}

class Graph {
    int n;
    java.util.LinkedList<Integer>[] adj;
    boolean[] visited;

    Graph(int n) {
        this.n = n;
        adj = new java.util.LinkedList[n];
        for (int i = 0; i < n; i++) {
            adj[i] = new java.util.LinkedList<>();
        }
        visited = new boolean[n];
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    void dfs(int v) {
        visited[v] = true;
        System.out.print(v + " ");
        for (int w : adj[v]) {
            if (!visited[w]) {
                dfs(w);
            }
        }
    }
}
