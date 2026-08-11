// 以下に必要な記述を追加せよ
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

class Edge{
    private int to;
    Edge(int to){this.to = to;}
    int To(){return to;}
}

class Node{
    int id;
    ArrayList<Edge> list;
    Node(int id){
	// 適切に記述
    this.id = id;
        list = new ArrayList<Edge>();
    }
    void addToList(int nid){
	// 適切に記述
     list.add(new Edge(nid));
    }
    ArrayList<Edge> getList(){
	// 適切に記述，下記も変更の必要あり
     return list;
	//return null;
    }
    // その他必要なものがあれば適当に作成
}

public class Graph{
    // 頂点のリスト
    // 配列であれば

    int num;
    Node [] nodes;
    
    // 可変長リストであれば
    //ArrayList<Node> nodes;
    
    void printGraph(){
	// Graph を表示
    for(int i = 0; i < num; i++){

            System.out.print(nodes[i].id + ":");

            ArrayList<Edge> list = nodes[i].getList();

            for(int j = 0; j < list.size(); j++){

                System.out.print(list.get(j).To());

                if(j != list.size() - 1){
                    System.out.print(",");
                }
            }
            System.out.println();
        }
    }

    void loadGraph(String filename){
	// グラフを詠み込み
	// コンストラクタで使用
    ArrayList<String> lines = new ArrayList<String>();

        try{

            BufferedReader br = new BufferedReader(new FileReader(filename));

            String line;

            while((line = br.readLine()) != null){
                lines.add(line);
            }

            br.close();

        }catch(IOException e){
            e.printStackTrace();
        }

        num = lines.size();

        nodes = new Node[num];

        for(int i = 0; i < num; i++){

            String line = lines.get(i);

            String[] sp = line.split(":");

            int id = Integer.parseInt(sp[0]);

            nodes[id] = new Node(id);

            if(sp.length > 1){

                String[] edge = sp[1].split(",");

                for(String s : edge){

                    if(s.length() > 0){
                        nodes[id].addToList(Integer.parseInt(s));
                    }

                }

            }

        }
    }
    
    Graph(String filename){
        loadGraph(filename);
    }
}

