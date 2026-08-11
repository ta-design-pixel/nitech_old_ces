// 前回の演習で作成した Graph.java をこれへ上書きコピーし、
// 課題1で指定された拡張を施せ。
//
// （なお、前回のGraphクラスを継承した新たなクラスとして作成しても構わない）
//
// 以下に必要な記述を追加せよ
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

class Edge {
    private int to;
    private double weight; 

    Edge(int to, double weight) {
        this.to = to;
        this.weight = weight;
    }

    int To() { return to; }
    double Weight() { return weight; } 
}

class Node {
    int id;
    ArrayList<Edge> list;

    Node(int id) {
        this.id = id;
        list = new ArrayList<Edge>();
    }

    void addToList(int nid, double weight) {
        list.add(new Edge(nid, weight));
    }

    ArrayList<Edge> getList() {
        return list;
    }
}

public class Graph {
    int num;
    Node[] nodes;

    public int getNumNodes() {
        return num;
    }

    void printGraph() {
        for (int i = 0; i < num; i++) {
            System.out.print(nodes[i].id + ":");
            ArrayList<Edge> list = nodes[i].getList();
            for (int j = 0; j < list.size(); j++) {
                Edge e = list.get(j);
                System.out.print(e.To() + "@" + e.Weight());
                if (j != list.size() - 1) {
                    System.out.print(",");
                }
            }
            System.out.println();
        }
    }

    void loadGraph(String filename) {
        ArrayList<String> lines = new ArrayList<String>();
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = br.readLine()) != null) {
                lines.add(line);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        num = lines.size();
        nodes = new Node[num];

        for (int i = 0; i < num; i++) {
            String line = lines.get(i);
            String[] sp = line.split(":");
            int id = Integer.parseInt(sp[0]);
            nodes[id] = new Node(id);

            if (sp.length > 1 && !sp[1].isEmpty()) {
                String[] edgeData = sp[1].split(",");
                for (String s : edgeData) {
                    String[] pair = s.split("@");
                    int targetNode = Integer.parseInt(pair[0]);
                    double weight = Double.parseDouble(pair[1]);
                    nodes[id].addToList(targetNode, weight);
                }
            }
        }
    }

    Graph(String filename) {
        loadGraph(filename);
    }
}