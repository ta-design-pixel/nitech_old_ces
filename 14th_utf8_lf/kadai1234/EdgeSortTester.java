// mainメソッドを含むEdgeSortTesterクラスを書く
// WUGraphクラスのgetSortedEdgesメソッドをテストする
// 課題2でmainメソッドを実行するクラス
// 辺の読み込みなどは課題1のプログラムを元にしてよい


import java.util.ArrayList;

public class EdgeSortTester {

    public static void main(String[] args) {

        WUGraph graph = new WUGraph();

        graph.loadGraph(args[0]);

        graph.printSortedEdges();
    }
}
