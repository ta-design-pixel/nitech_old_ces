// 以下に必要な記述を追加せよ

// クラス宣言は Dijkstra クラスを継承するよう変更する

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class PQDijkstra extends Dijkstra{
    public PQDijkstra(String filename) {
        super(filename);
    }
    // doDijkstra メソッドをオーバーライド（適宜変更すること）
    int[] doDijkstra(int start) {
        int[] parent = new int[num];
        double[] dist = new double[num];
        Arrays.fill(dist, Double.POSITIVE_INFINITY);
        Arrays.fill(parent, -1);

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.comparingDouble(i -> dist[i]));

        dist[start] = 0;
        pq.add(start);

        while (!pq.isEmpty()) {
            int u = pq.poll();

            for (Edge e : nodes[u].getList()) {
                int v = e.To();
                if (dist[u] + e.Weight() < dist[v]) {
                    dist[v] = dist[u] + e.Weight();
                    parent[v] = u;
                    pq.add(v); 
                }
            }
        }
        return parent;
    }
}
