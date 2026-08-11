// 以下に必要な記述を追加せよ
public class Dijkstra extends Graph{
    public Dijkstra(String filename) {
        super(filename);
    }
    int[] doDijkstra(int start) {
        int[] parent = new int[num]; 
        double[] dist = new double[num]; 
        boolean[] visited = new boolean[num]; 
        
        for(int i = 0; i < num; i++) {
            dist[i] = Double.POSITIVE_INFINITY;
            parent[i] = -1; 
        }
        dist[start] = 0;

        for(int i = 0; i < num; i++) {
            int u = -1;
            double minDist = Double.POSITIVE_INFINITY;
            for(int v = 0; v < num; v++) {
                if(!visited[v] && dist[v] < minDist) {
                    minDist = dist[v];
                    u = v;
                }
            }

            if(u == -1) break; 
            visited[u] = true;

            for(Edge e : nodes[u].getList()) {
                int v = e.To();
                if(dist[u] + e.Weight() < dist[v]) {
                    dist[v] = dist[u] + e.Weight();
                    parent[v] = u;
                }
            }
        }
        return parent;
    }

    int[] getShortestPath(int start, int end) {
        int[] parent = doDijkstra(start);
        

        java.util.ArrayList<Integer> path = new java.util.ArrayList<>();
        int curr = end;
        while(curr != -1) {
            path.add(0, curr);
            if(curr == start) break;
            curr = parent[curr];
        }
        
        if (path.isEmpty() || path.get(0) != start) return new int[0];

        int[] result = new int[path.size()];
        for(int i = 0; i < path.size(); i++) result[i] = path.get(i);
        return result;
    }
    }

