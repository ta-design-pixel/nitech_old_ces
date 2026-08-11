// mainメソッドを含むMSTTesterクラスを書く
// WUGraphクラスのgetMSTメソッドをテストする
// 課題4でmainメソッドを実行するクラス
// 結果を指定された形式で標準出力(printlnなど)に出力する 
public class MSTTester {

    public static void main(String[] args) {

        WUGraph graph = new WUGraph();


        // 入力
        graph.loadGraph(args[0]);


        // MST作成
        WUGraph mst = graph.getMST();


        // 重み合計
        System.out.println(
            "TotalWeight: " + mst.getTotalWeight()
        );


        System.out.println("MST:");


        // MST表示
        mst.printGraph();
    }
}