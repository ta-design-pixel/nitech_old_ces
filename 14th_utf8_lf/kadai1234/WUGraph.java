
import java.io.*;
import java.util.*;
// Edge, (Node,) WUGraphクラスを書く

class Node { // ノード(省略可)

    int id; // ノード番号

    Node(int id) {
        this.id = id;
    }

    int getId() {
        return id;
    }
}

class Edge implements Comparable<Edge> { // 辺

    int id; // 辺の番号
    int nodeU, nodeV; // 両端のノード番号
    int cost; // 辺の重み

    Edge(int id, int nodeU, int nodeV, int cost) {
        this.id = id;
        this.nodeU = nodeU;
        this.nodeV = nodeV;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public int getNodeU() {
        return nodeU;
    }

    public int getNodeV() {
        return nodeV;
    }

    public int getCost() {
        return cost;
    }

    public int compareTo(Edge e) {

        if (this.cost != e.cost) {
            return this.cost - e.cost;
        }

        return this.id - e.id;
    }
}

public class WUGraph {

    int numOfNodes; // ノード数(ノード番号の範囲)の情報は必須
// 可変長リストを使う場合
    private ArrayList<Node> nodes; // (省略可)
    private ArrayList<Edge> edges;
// 配列を使う場合
// private Node[] nodes; // (省略可)
// private Edge[] edges;

    public WUGraph() {
        nodes = new ArrayList<>();
        edges = new ArrayList<>();
    }

    public void loadGraph(String filename) {

        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));

            // 1行目
            String line = br.readLine();
            String[] first = line.split(",");

            numOfNodes = Integer.parseInt(first[0]);
            int numOfEdges = Integer.parseInt(first[1]);

            // ノード生成
            for (int i = 0; i < numOfNodes; i++) {
                nodes.add(new Node(i));
            }

            // 辺を読み込む
            for (int i = 0; i < numOfEdges; i++) {

                line = br.readLine();

                String[] p = line.split(":");
                int id = Integer.parseInt(p[0]);

                String[] data = p[1].split(",");

                int u = Integer.parseInt(data[0]);
                int v = Integer.parseInt(data[1]);
                int cost = Integer.parseInt(data[2]);

                edges.add(new Edge(id, u, v, cost));
            }

            br.close();

        } catch (IOException e) {
            System.out.println("ファイルを開けません");
            e.printStackTrace();
        }
    }

    // グラフを表示
    public void printGraph() {

        System.out.println(numOfNodes + "," + edges.size());

        for (Edge e : edges) {
            System.out.println(
                    e.getId() + ":"
                    + e.getNodeU() + ","
                    + e.getNodeV() + ","
                    + e.getCost()
            );
        }
    }

    public ArrayList<Edge> getSortedEdges() {

        ArrayList<Edge> al = new ArrayList<>(edges);

        Collections.sort(al);

        return al;
    }

    public void printSortedEdges() {

        ArrayList<Edge> sorted = getSortedEdges();

        for (Edge e : sorted) {
            System.out.println(
                    e.getId() + ":"
                    + e.getNodeU() + ","
                    + e.getNodeV() + ","
                    + e.getCost()
            );
        }
    }

    public WUGraph(int n) {    //kadai4の後付

        numOfNodes = n;

        nodes = new ArrayList<>();
        edges = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            nodes.add(new Node(i));
        }
    }

    public void addEdge(Edge e) {
        edges.add(e);
    }

    public int getTotalWeight() {

        int total = 0;

        for (Edge e : edges) {
            total += e.getCost();
        }

        return total;
    }

    WUGraph getMST() {
        WUGraph mst = new WUGraph(numOfNodes); // 結果のMST（辺の集合はまだ空)
        ArrayList<Edge> selst = getSortedEdges();
        UnionFind uf = new UnionFind(numOfNodes);
        for (Edge e : selst) {
            if (uf.unite(e.nodeU, e.nodeV)) { // 部分木の統合
                mst.addEdge(e);
            }
        }
        return mst;
    }
}
