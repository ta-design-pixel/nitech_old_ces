// mainメソッドを含むLoadPrintTesterクラスを書く
// WUGraphクラスのloadGraphメソッドとprintGraphメソッドをテストする
// 課題1でmainメソッドを実行するクラス
// 前回作成したものと同様の検証をする
public class LoadPrintTester {

    public static void main(String[] args) {

        WUGraph graph = new WUGraph();

        // グラフを読み込む
        graph.loadGraph(args[0]);

        // 読み込んだ内容を表示
        graph.printGraph();
    }

}

